#!/usr/bin/env python3
"""Check local Markdown link targets in the repository."""
import os
import re
import sys

ROOT = os.getcwd()
files = []
for base, dirs, names in os.walk(ROOT):
    dirs[:] = [d for d in dirs if d not in (".git", "out")]
    for name in names:
        if name.endswith(".md"):
            files.append(os.path.join(base, name))

def anchors(text):
    result = set()
    for line in text.splitlines():
        if line.startswith("#"):
            heading = line.lstrip("#").strip().lower()
            heading = re.sub(r"[^\w -]", "", heading)
            heading = re.sub(r"\s+", "-", heading).strip("-")
            result.add(heading)
    return result

errors = []
for source in files:
    with open(source, encoding="utf-8") as fh:
        text = fh.read()
    text = re.sub(r"```.*?```", "", text, flags=re.S)
    for match in re.finditer(r"(?<!!)\[[^\]]*\]\(([^)]+)\)", text):
        target = match.group(1).strip()
        if target.startswith(("https://", "http://", "mailto:", "#")):
            if target.startswith("#") and target[1:] not in anchors(text):
                errors.append(f"{os.path.relpath(source)}: unresolved local anchor {target}")
            continue
        path, _, fragment = target.partition("#")
        path = path.split("?")[0]
        if not path:
            target_file = source
        else:
            target_file = os.path.normpath(os.path.join(os.path.dirname(source), path))
        if not os.path.isfile(target_file):
            errors.append(f"{os.path.relpath(source)}: missing target {target}")
        elif fragment:
            with open(target_file, encoding="utf-8") as fh:
                target_text = fh.read()
            if fragment not in anchors(target_text):
                errors.append(f"{os.path.relpath(source)}: anchor may be missing: {target}")

if errors:
    print("\n".join(errors))
    print(f"FAILED: {len(errors)} Markdown links/anchors need attention.")
    sys.exit(1)
print(f"PASS: scanned {len(files)} Markdown files for local link targets.")

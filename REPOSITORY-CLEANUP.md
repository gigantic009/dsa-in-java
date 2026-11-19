# Repository Cleanup Policy and Inventory

## Cleanup objective
Keep this repository focused on learning DSA in Java. Remove accidental artifacts, redundant copies, obsolete generated files, empty placeholder content and irrelevant tooling—without removing educational content, working examples, tests or audit evidence.

## Protected content (not cleanup targets)
- All topic modules, Java solutions, explanatory Markdown, exercises, worked examples and notes.
- LeetCode and interview practice mappings/question banks (metadata must be caveated if unverified).
- Assessments, answer explanations, project briefs, revision tools, glossary and progress tracking.
- Tests, CI, link checker and source audit records while the quality audit remains open.
- Branch snapshots that preserve unique material until semantic review and migration is complete.

## Cleanup changes
- `ROADMAP.md` was shortened to an entry-point page, because the detailed sequence is maintained in `COURSE-ROADMAP.md`. The concise page remains for discoverability.
- A repository-wide tree scan did not identify obvious non-study artifacts (e.g. build outputs, temporary files, editor backups, or binary clutter) in the main branch at the time of review.
- Audit and migration documents are intentionally retained; they are not course clutter while this audit is active.

## Deletion decision rule
Do not delete a file merely because it is short, old, or duplicated in concept. First verify references, compare content, preserve unique learning value, update navigation, and only then remove confirmed redundant copies. Never delete branches as part of cleanup before reconciliation.

## Status
Cleanup review is ongoing and limited to the inspected main-branch inventory. This is not a claim that all branches, histories, or files have been fully cleaned.

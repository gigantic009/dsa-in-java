# Data Structures & Algorithms in Java ☕

A single Java DSA repository organised with **one Git branch per main topic**.

**Repository → topic branch → subtopic folders → difficulty groups → individual Java solutions.**

The topic branches are the canonical working areas. The default `main` branch is the landing page, branch directory and overall progress index.

## Topic branches

| Topic | Git branch | Questions in supplied merged bank |
|---|---|---:|
| Arrays | `arrays` | 56 |
| Strings | `strings` | 54 |
| 2D Arrays / Matrix | `2d-arrays-matrix` | 20 |
| Searching & Sorting | `searching-sorting` | 56 |
| Backtracking | `backtracking` | 29 |
| Linked Lists | `linked-lists` | 58 |
| Stacks & Queues | `stacks-queues` | 59 |
| Greedy | `greedy` | 51 |
| Binary Trees | `binary-trees` | 66 |
| Binary Search Trees | `binary-search-trees` | 41 |
| Heaps & Hashing | `heaps-hashing` | 46 |
| Graphs | `graphs` | 74 |
| Tries | `tries` | 6 |
| Dynamic Programming | `dynamic-programming` | 99 |
| Bit Manipulation | `bit-manipulation` | 10 |
| Segment Trees | `segment-trees` | 6 |
| **Total** | **16 topic branches** | **731** |

Open a branch from the [Branches page](https://github.com/gigantic009/dsa-in-java/branches/all).

## Inside each topic branch

Use a consistent hierarchy:

```text
topic-branch/
├── README.md
├── topics/
│   ├── 01-topic-fundamentals/
│   │   └── README.md
│   ├── 02-problem-pattern/
│   │   ├── README.md
│   │   ├── Easy/
│   │   ├── Medium/
│   │   └── Hard/
│   └── ...
├── question-bank/
│   └── QUESTION-BANK.md
└── solutions/
    └── ProblemName.java
```

- Theory-only fundamentals contain explanations, examples and diagrams—not artificial coding tasks.
- Coding questions are grouped by actual topic and pattern, not by the sheet they came from.
- Questions are ordered by the difficulty labels in the supplied workbook. Those labels are estimates, not universal difficulty ratings.
- Java solutions use straightforward, readable code. Explanations, dry runs and complexity analysis belong in Markdown rather than comments inside solution code.

## Source handling

The merged topic-wise workbook contains **731 unique problem titles** across 16 topics. Its source column records whether a question appears in the Apna College 375 sheet, Love Babbar 450 sheet, or both. The Apna sheet's company names are retained with the corresponding questions. Love Babbar questions without supplied company labels remain untagged.

Company associations are transcribed source claims, not independently verified interview records. Similar-but-not-identical titles are not silently merged; original wording is preserved so that variants can be reviewed.

The uploaded *Ultimate DSA Preparation Sheet* is a resource-link page (NeetCode 150, Striver A2Z, DSA patterns and a top-LeetCode list), not a further complete question bank. Those linked resources should be imported only when their actual question lists are supplied or accessible.

## Completion policy

A question is not considered solved merely because it appears in the bank. Mark it solved only after:
1. a Java implementation is written;
2. edge cases are checked;
3. the approach and time/space complexity are documented.

**Understand the pattern. Trace the code. Test edge cases. Analyse complexity.**

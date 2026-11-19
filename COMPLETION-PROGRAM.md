# Completion Program — DSA in Java

This document defines what "complete" means. Progress is evidence-based, not based on file count.

## Workstream 1 — 23-topic teaching modules

A topic is teaching-complete only when it includes:
- Prerequisites and measurable learning outcomes.
- Plain-language intuition and a real-world analogy.
- Core definitions and diagrams/pseudocode where appropriate.
- At least two worked examples with traces.
- A standalone Java implementation or clear implementation reference.
- Time and auxiliary-space analysis with justification.
- Correctness reasoning or an invariant.
- Common pitfalls and edge cases.
- Guided exercises (easy to harder), hints, and answer explanations.
- A short quiz, mastery gate, and next-topic links.

### Module checklist
- [ ] 00 Foundations
- [ ] 01 Java Basics
- [ ] 02 Complexity
- [ ] 03 Arrays
- [ ] 04 Searching and Sorting
- [ ] 05 Two-Dimensional Arrays
- [ ] 06 Strings
- [ ] 07 Bit Manipulation
- [ ] 08 OOP
- [ ] 09 Recursion
- [ ] 10 Divide and Conquer
- [ ] 11 Linked Lists
- [ ] 12 Stacks
- [ ] 13 Queues
- [ ] 14 Binary Trees
- [ ] 15 Binary Search Trees
- [ ] 16 Heaps and Hashing
- [ ] 17 Graphs
- [ ] 18 Greedy
- [ ] 19 Backtracking
- [ ] 20 Dynamic Programming
- [ ] 21 Tries
- [ ] 22 Segment Trees
- [ ] 23 Interview Patterns

## Workstream 2 — Java source audit

For every source file, review:
- Compilation and class/file compatibility.
- Correctness, algorithm assumptions and invariants.
- Null, empty, singleton and boundary behavior.
- Duplicate values and adversarial inputs.
- Overflow, recursion depth and resource risks.
- Mutability and side effects.
- Input validation and clear error behavior.
- Complexity claims.
- Code clarity, comments and teaching suitability.
- Test coverage or explicit test gap.

### Status vocabulary
- **Not reviewed:** no claim of correctness.
- **Reviewed:** human/source-level inspection performed.
- **Tested:** test evidence exists.
- **Verified:** review and meaningful tests, including edge cases, support the implementation.
Compilation alone is not verification.

## Workstream 3 — Branch reconciliation

For each branch:
1. Inventory tree paths.
2. Compare files using content hashes and diff—not names alone.
3. Review branch-only solutions, notes, question banks and tests.
4. Identify duplicate, unique, obsolete or broken material.
5. Preserve useful unique content on main.
6. Test migrated content and update navigation.
7. Only after review, propose deletion/archive of stale branch material.

Branch table (initial inventory; detailed semantic review remains):
| Branch | Status |
|---|---|
| main | Primary course; ongoing |
| 2d-arrays-matrix | Inventory |
| arrays | Partial migration; question-bank review pending |
| backtracking | Inventory |
| binary-search-trees | Inventory |
| binary-trees | Inventory |
| bit-manipulation | Inventory |
| dynamic-programming | Inventory |
| feature/topic-wise-dsa-course | Inventory |
| graphs | Inventory |
| greedy | Inventory |
| heaps-hashing | Inventory |
| linked-lists | Inventory |
| searching-sorting | Inventory |
| segment-trees | Inventory |
| stacks-queues | Inventory |
| strings | Inventory |
| tries | Inventory |

## Workstream 4 — Test strategy

The course should add:
- Focused deterministic unit tests per algorithm.
- Edge-case and invalid-input tests.
- Randomized differential tests against simple reference implementations for suitable algorithms.
- Regression tests for each fixed defect.
- CI checks for compilation, tests, Markdown links and formatting/structure.
- Separate judge-style solution tests where appropriate.

## Workstream 5 — Assessment and projects

Planned assessments:
- Foundations & Java checkpoint.
- Arrays/searching checkpoint.
- Strings/bit manipulation checkpoint.
- Recursion/backtracking checkpoint.
- Trees/heaps checkpoint.
- Graphs checkpoint.
- DP/greedy checkpoint.
- Mixed timed interview tests.
- Monthly cumulative tests.

Suggested projects:
1. Student grade/record manager (Java fundamentals, arrays and OOP).
2. Playlist or task manager (linked list, stack, queue).
3. Expression parser/evaluator (stack).
4. Contact/search index (hashing/trie).
5. Graph route explorer (BFS/DFS/shortest path).
6. Scheduling optimizer (greedy).
7. Sudoku or N-Queens visual solver (backtracking).
8. Coin/change and resource planner (DP).
9. Range-query analytics engine (segment tree).
10. Capstone: integrated console-based algorithm toolkit with test suite and documentation.

## Workstream 6 — LeetCode mapping

For each recommended problem, record:
- Official problem link and ID/title.
- Topic/pattern and difficulty.
- Prerequisites.
- Whether a repository solution exists (path).
- Whether the solution was reviewed and tested.
- Student attempt status and spaced-review dates.
- Company tags only if a credible, current source supports them; otherwise omit.
- Avoid implying a company tag is a guarantee or official association.

## Completion and publication

- Never mark an entire topic complete from a README placeholder.
- Never delete unique branch content before preserving it.
- Never label all solutions verified unless test/review evidence supports it.
- Keep the repository's status report current.

# DSA Project Lab — Java

Build these projects progressively to apply the algorithms and data structures in this repository. For each project, keep the implementation readable, separate responsibilities, test edge cases, and explain the algorithm choices. Do not use a project as a substitute for understanding the underlying patterns.

## 1. Student Records Console (beginner)
**Concepts:** arrays or collections, searching, sorting, classes and objects.

**Features:** create, update, delete and search student records; calculate average and grade reports; sort by marks or name; validate input.

**Acceptance criteria:** define a duplicate-ID policy; handle an empty dataset; validate marks and IDs; demonstrate search and sorting; include tests and a README.

## 2. Task Scheduler (beginner/intermediate)
**Concepts:** queues, priority queues, sorting.

**Features:** enqueue tasks, assign priority and due date, change task status, simulate task processing.

**Acceptance criteria:** specify priority ordering and tie-breaking (including FIFO for equal priority if selected); handle an empty queue; validate status transitions and task input; include unit tests.

## 3. Expression Calculator (intermediate)
**Concepts:** stacks, tokenization, precedence, parentheses.

**Features:** evaluate arithmetic expressions; optionally support unary signs; report malformed expressions clearly.

**Acceptance criteria:** test precedence, nested parentheses, associativity, whitespace, malformed expressions, division by zero, and numeric overflow where applicable. Document supported operators and numeric types.

## 4. Contact Prefix Search (intermediate)
**Concepts:** HashMap and Trie.

**Features:** add, delete, search contacts and provide prefix suggestions.

**Acceptance criteria:** define duplicate and case-handling policies; handle empty prefix, empty input and missing prefix; validate contact names; tests for insert, search, deletion and suggestions.

## 5. Route Explorer (intermediate)
**Concepts:** graph adjacency lists, BFS, DFS, shortest paths.

**Features:** test route existence, find an unweighted shortest route, and find weighted routes with non-negative edge weights.

**Acceptance criteria:** handle disconnected graphs, isolated vertices and missing routes; validate vertices and edges; use BFS for unweighted shortest paths and Dijkstra for non-negative weighted paths; explain path reconstruction and complexities.

## 6. Sudoku / N-Queens Solver (advanced)
**Concepts:** backtracking and pruning.

**Features:** solve valid inputs and report when no solution exists.

**Acceptance criteria:** validate board or problem input; restore state correctly during backtracking; test solvable, unsolvable and invalid inputs; explain pruning and complexity.

## 7. Resource Planner (advanced)
**Concepts:** greedy algorithms and dynamic programming.

**Features:** compare a greedy baseline with a DP solution for a well-defined resource allocation or coin-change problem.

**Acceptance criteria:** specify the problem constraints; demonstrate a case where greedy fails (when one exists); explain the DP recurrence, base cases, state and complexity; test boundary cases.

## 8. Range Analytics (advanced)
**Concepts:** segment trees.

**Features:** point updates and range sum/minimum queries.

**Acceptance criteria:** document inclusive/exclusive query conventions; validate ranges; test empty or invalid input as appropriate; compare results against a brute-force implementation on generated test cases; demonstrate performance.

## 9. Algorithm Toolkit Capstone
Build a menu-based Java application that combines multiple modules. Keep algorithms and user-interface code separated, automate tests, provide useful errors and a reproducible README. Include sample input/output, complexity summaries, and limitations.

## Definition of done for every project
- Scope, user stories and expected behavior documented.
- Algorithm choices, correctness intuition and complexity explained.
- Input validation and edge cases handled.
- Automated tests for normal, boundary and invalid cases.
- README includes compile/run instructions, examples and expected output.
- Keep code modular, readable and consistent with repository coding standards.
- No secrets, generated binaries or unrelated files in commits.

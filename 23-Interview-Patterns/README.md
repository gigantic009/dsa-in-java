# Interview Patterns — Recognize the Structure, Prove the Invariant

Patterns are shortcuts for recognizing repeated algorithmic structures. They are not replacements for reasoning: every pattern needs a valid precondition and invariant.

## Core patterns
- **Two pointers:** maintain two indices and move them according to a property (often sorted arrays or opposite ends).
- **Sliding window:** maintain a contiguous range; define exactly when it can expand or shrink.
- **Fast/slow pointers:** exploit different movement speeds for linked-list or sequence structure.
- **Prefix sum + hash map:** count/find subarray properties by relating prefix states.
- **Binary search on answer:** feasibility is monotonic; define and prove the predicate.
- **Monotonic stack/queue:** retain candidates in an order useful for next-greater, extrema or range problems.
- **Top-K:** use a heap or selection method based on required ordering and size.
- **Intervals:** sort and reason about overlap, endpoints and merge rules.
- **DSU:** maintain connectivity under union operations.

## Pattern journal
For every problem, record: the signal that suggested the pattern; brute force; invariant; why pointer/state updates are valid; complexity; boundary cases; and one similar problem.

## Practice
Do not simply tag a problem. After solving, explain why a tempting alternate pattern fails or is less efficient.


## Sprint teaching expansion

Clarify constraints, brute force, bottleneck, invariant, implementation, tests and complexity. Patterns hashing, pointers, window, binary search, prefix, stack, BFS/DFS, heap, backtracking, DP. Mixed practice.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.

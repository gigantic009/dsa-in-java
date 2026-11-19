# Interview Patterns — Recognize the Structure, Prove the Invariant

Algorithmic patterns help recognize recurring problem structures. A pattern is only valid when its preconditions hold and its invariant is understood.

## Core patterns
- **Two pointers:** maintain two indices and move them according to a property (often a sorted array or opposite ends).
- **Sliding window:** maintain a contiguous range; define exactly when it can expand or shrink.
- **Fast/slow pointers:** exploit different movement speeds in linked-list or sequence structures.
- **Prefix sum + hash map:** count or find subarray properties by relating prefix states.
- **Binary search on answer:** feasibility is monotonic; define and prove the predicate.
- **Monotonic stack/queue:** retain candidates in an order useful for next-greater elements or range extrema.
- **Top-K:** use a heap or selection method based on the required ordering and size.
- **Intervals:** sort and reason about overlap, endpoints and merge rules.
- **DSU:** maintain connectivity under union operations.

## Pattern journal
For every problem, record the signal that suggested the pattern, brute force, invariant, why state updates are valid, complexity, boundary cases, and one related problem.

## Implemented example
- [Two pointers — pair sum in a sorted array](01-Core-Patterns/TwoSumSorted.java): O(n) time, O(1) auxiliary space. The input must be sorted in non-decreasing order.

## Practice roadmap
See [Core Patterns practice list](01-Core-Patterns/README.md) for the problem roadmap.

## Sprint teaching approach
Clarify constraints, derive brute force, identify the bottleneck, establish an invariant, implement, test, and analyze. Build pattern fluency across hashing, pointers, windows, binary search, prefix sums, stacks, BFS/DFS, heaps, backtracking and dynamic programming.

## Self-check
Can you explain the pattern, trace it, justify each update, implement it without hints, test boundary cases, and analyze complexity?

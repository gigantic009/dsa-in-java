# Dynamic Programming — Derive It, Don't Memorize It

Prerequisites: recursion, arrays, loops and complexity analysis.

DP uses reusable subproblem results when states overlap and a recurrence can combine smaller answers.

## Design checklist
1. State meaning.
2. Transition/recurrence.
3. Base cases.
4. Computation order.
5. Answer state.
6. States × work per state (time).
7. Auxiliary and output space.

## Learning sequence
- [Fundamentals](01-Part-1-Fundamentals/README.md): memoization.
- [1D DP](02-Part-2-1D-DP/README.md): sequence transitions.
- [Grid DP](03-Part-3-Grid-DP/README.md).
- [Knapsack and subsequences](04-Part-4-Knapsack-and-Subsequences/README.md).
- [Strings and advanced DP](05-Part-5-Strings-and-Advanced-DP/README.md).

## Implemented examples
Fibonacci memoization, Climbing Stairs, House Robber, Unique Paths, 0/1 Knapsack, Longest Common Subsequence.

## Pitfalls
Incorrect state, missing transition choices, initialization/order errors, updating in-place too early, overflow, optimizing space before understanding the table, and assuming all recursion is DP.

Checkpoint: derive the recurrence for each implemented problem and independently solve Subset Sum, Coin Change, LIS and Edit Distance.
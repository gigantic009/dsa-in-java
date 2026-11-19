# Dynamic Programming Fundamentals

DP reuses results of smaller subproblems. Understand the recursive state and recurrence first, then cache (memoization) or compute iteratively (tabulation).

## Design checklist
State meaning, recurrence, base cases, dependency order, answer state, time and space.

## Implemented
- [FibonacciMemo.java](FibonacciMemo.java) — top-down memoization; O(n) time and O(n) memory including recursion stack. Uses checked int addition.

## Related implementations
- [Climbing Stairs](../02-Part-2-1D-DP/ClimbingStairs.java)
- [House Robber](../02-Part-2-1D-DP/HouseRobber.java)
- [Unique Paths](../03-Part-3-Grid-DP/UniquePaths.java)

## Practice order
Fibonacci recursion → memoization → tabulation → Climbing Stairs → Frog Jump → House Robber → Minimum Cost Stairs.

## Mistakes to avoid
Vague state, incorrect indices, missing base cases, incorrect order, invalid transitions and premature optimization.

Checkpoint: explain state, transition and base cases before coding.
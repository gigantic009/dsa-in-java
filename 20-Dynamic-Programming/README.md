# Dynamic Programming — Derive It, Don't Memorize It

## Prerequisites
Recursion, arrays, loops, complexity and basic mathematical reasoning.

## 1. What DP solves
Dynamic programming is useful when a problem has overlapping subproblems and a way to build an optimal or countable answer from smaller states. These properties are clues, not a guarantee that DP is the right technique.

## 2. Derivation framework
For each DP problem, explicitly define:
1. **State:** what does dp[i] or dp[i][j] mean?
2. **Transition:** how can this state be built from smaller states?
3. **Base cases:** what values are known?
4. **Order:** in what order are states computed?
5. **Answer:** which state(s) give the result?
6. **Complexity:** how many states and how much work per state?
7. **Space:** which states must be retained?

## Learning sequence
- [Part 1: Fundamentals](01-Part-1-Fundamentals/README.md): recursion, memoization and tabulation.
- [Part 2: 1D DP](02-Part-2-1D-DP/README.md): sequence and state transitions.
- [Part 3: Grid DP](03-Part-3-Grid-DP/README.md): grid paths, obstacles and costs.
- [Part 4: Knapsack and subsequences](04-Part-4-Knapsack-and-Subsequences/README.md): subset sum, knapsack and sequence patterns.
- [Part 5: Strings and advanced DP](05-Part-5-Strings-and-Advanced-DP/README.md): LCS/edit distance and advanced states.

## 3. Typical progression
First write the recursive relation. Add memoization to avoid recomputing states. Convert to tabulation after understanding dependencies. Optimize space only after the full table is correct.

## Common traps
- State does not capture all necessary information.
- Transition misses a valid choice.
- Incorrect initialization.
- Tabulation order violates dependencies.
- In-place update changes a state too early.
- Space optimization hides the recurrence.
- Treating every recursion as DP.

## Checkpoint
Derive and implement Fibonacci, stairs, house robber, grid paths, subset sum and one string DP problem from a blank editor, explaining the state and transition.

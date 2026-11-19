# Greedy Fundamentals

Greedy algorithms make a locally preferred choice at each step. They work only when that choice can be justified as part of an optimal solution.

## How to evaluate a greedy idea
1. Define the choice precisely.
2. Prove it is safe (often an exchange argument).
3. Explain why the remaining subproblem is manageable.
4. Test counterexamples to alternative choices.

## Implemented examples
- [x] Activity Selection — ActivitySelection.java (sort by finish time)
- [x] Fractional Knapsack — FractionalKnapsack.java (sort by value/weight; fractions allowed)
- [x] Assign Cookies — AssignCookies.java (LeetCode 455; sort and match)

## Practice
- [ ] Jump Game (implemented in Problem Patterns)
- [ ] Gas Station
- [ ] Job Sequencing
- [ ] Minimum Platforms
- [ ] Non-overlapping Intervals
- [ ] Candy Distribution

## Important
Greedy fractional knapsack does not solve 0/1 knapsack in general. Sorting the input arrays is avoided in Assign Cookies by sorting copies.

## Checkpoint
Write the greedy choice and justify why an optimal solution can be made to include it.
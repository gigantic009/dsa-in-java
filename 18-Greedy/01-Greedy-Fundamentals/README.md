# Greedy Fundamentals

A greedy algorithm makes a locally preferred choice at each step. Greedy is a strategy, not a guarantee of correctness.

## How to evaluate a greedy idea
- Define the choice precisely.
- Show it is safe (an exchange argument or other proof).
- Show the remaining problem can be solved after the choice.
- Compare with counterexamples to alternative choices.

## Starter examples
- Activity selection: sort by finishing time and select compatible activities.
- Fractional knapsack: sort by value/weight ratio; fractions are allowed.
- Assign cookies: sort both arrays and match greedily.
- Jump Game: track the farthest reachable position.

## Practice
Easy: Activity Selection, Fractional Knapsack, Assign Cookies.
Core: Jump Game, Gas Station, Job Sequencing, Minimum Platforms, Non-overlapping Intervals.
Challenge: Candy Distribution.

## Warning
The greedy strategy for fractional knapsack does not solve 0/1 knapsack in general. A plausible greedy rule is not a proof.

## Checkpoint
For each problem, write the greedy choice and justify why an optimal solution can be made to include it.

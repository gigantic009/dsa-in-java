# Dynamic Programming Fundamentals

Dynamic programming (DP) is useful when a problem can be expressed using smaller states and reusable subproblem results. It is not simply recursion with an array; the state and transition must represent the problem correctly.

## The DP design checklist
1. **State:** what does dp[i] (or dp[i][j]) mean in plain language?
2. **Transition:** which smaller states determine it?
3. **Base cases:** what is known without further computation?
4. **Order:** in what order must states be computed?
5. **Answer:** which state or combination of states is the result?
6. **Complexity:** how many states and how much work per state?

## Two implementation styles
- **Memoization:** recursive approach plus cache; compute only reached states.
- **Tabulation:** iterative computation in dependency order.

## Starter examples
- Fibonacci: demonstrate repeated work and memoization.
- Climbing Stairs: define dp[i] as the ways to reach step i.
- Frog Jump: transitions from a limited set of previous positions.
- House Robber: choose whether to take the current item or skip it.
- Minimum Cost Climbing Stairs: track minimum accumulated cost.

## Practice order
1. Fibonacci recursion → memoization → tabulation.
2. Climbing Stairs.
3. Frog Jump.
4. House Robber.
5. Min Cost Climbing Stairs.

## Common mistakes
- Defining the state vaguely.
- Mixing up indices and meaning.
- Forgetting base cases.
- Computing states before dependencies exist.
- Using a transition that violates the constraints.
- Optimizing space before understanding the full table.

## Checkpoint
For each problem, write the state definition, transition, base cases, computation order and complexity before writing code.

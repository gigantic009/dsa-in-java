# Backtracking Fundamentals

Backtracking explores choices systematically: **choose, explore, undo**. Undoing restores state so the next branch is independent.

## General template
```text
backtrack(state):
    if state is complete:
        record solution
        return

    for each valid choice:
        apply choice
        backtrack(updated state)
        undo choice
```

This is a conceptual template; implementations differ in state, choices, constraints, and pruning.

## Key ideas
- **State:** current partial solution.
- **Choice:** next decision.
- **Constraint:** whether a choice is legal.
- **Pruning:** skip branches that cannot produce a valid solution.
- **Undo:** restore state after recursion.

## Learning order
1. Subsets
2. Permutations — [Permutations.java](../02-Backtracking-Problem-Patterns/Permutations.java)
3. Combination Sum
4. Combination Sum II (duplicate control)
5. Subsets II
6. Generate Parentheses — [GenerateParentheses.java](GenerateParentheses.java)
7. Palindrome Partitioning
8. N-Queens — [NQueens.java](NQueens.java)
9. Sudoku Solver

## Tracing
Draw a decision tree for a small input. Label each edge with the choice and each node with the current state. Identify where choices are undone and where branches are pruned.

## Implemented examples
- Generate Parentheses (LeetCode 22)
- N-Queens (LeetCode 51)

## Practice
Start with subsets and permutations. Predict the number of outputs for small inputs, then test duplicates and boundary cases where applicable.

## Checkpoint
Write the template from memory. Solve subsets and permutations, and explain why every branch restores its state.

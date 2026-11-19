# Backtracking Fundamentals

Backtracking explores choices systematically. Choose, explore, and undo when returning so the next branch starts from the correct state.

## A general template
```text
backtrack(state):
    if state is a complete solution:
        record it
        return

    for each valid choice:
        apply choice
        backtrack(updated state)
        undo choice
```

The template is conceptual; actual implementations differ in how they define state, choices, and constraints.

## Key ideas
- **State:** current partial solution.
- **Choice:** next decision.
- **Constraint:** whether a choice is legal.
- **Pruning:** stop exploring a branch that cannot produce a valid solution.
- **Undo:** restore the state before trying another choice.

## Learning order
1. Subsets
2. Permutations
3. Combination Sum
4. Combination Sum II (duplicate control)
5. Subsets II
6. Generate Parentheses
7. Palindrome Partitioning
8. N-Queens
9. Sudoku Solver

## How to trace
For a small problem, draw a decision tree. Label each edge with the choice and each node with the state. Identify where choices are undone and where branches are pruned.

## Practice
Start with subsets and permutations. Before coding, predict the number of outputs for small input sizes and test duplicate inputs when allowed.

## Checkpoint
Write a backtracking template from memory. Solve subsets, then permutations, and explain why each branch restores state.

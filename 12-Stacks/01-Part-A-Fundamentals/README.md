# Stack Fundamentals

A stack is LIFO: the most recently added element is removed first.

## Operations
- push: add
- pop: remove top
- peek: inspect top
- isEmpty: check emptiness

These are typically O(1) for array-backed stacks and linked stacks.

## Java
For most new Java code, `ArrayDeque` is a useful stack implementation: `push`, `pop`, and `peek`. Handle empty-state behavior intentionally.

## Applications
- Matching parentheses
- Undo and backtracking
- Expression parsing/evaluation
- DFS
- Monotonic stacks for next greater/smaller elements

## Practice
### Easy
Implement a stack, valid parentheses, reverse a stack.

### Core
Min Stack, postfix evaluation, infix conversion, queue using stacks.

### Challenge
Basic Calculator and advanced expression parsing.

## Common mistakes
- Popping an empty stack.
- Confusing LIFO with FIFO.
- Using a monotonic stack without defining whether it stores increasing/decreasing values or indices.
- Forgetting the stack may need indices to compute distances.

## Checkpoint
Implement stack operations with ArrayDeque. Trace Valid Parentheses and a next-greater-element problem.

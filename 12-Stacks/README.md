# Stacks — LIFO and Monotonic Patterns

## Prerequisites
Arrays, linked lists, loops and complexity.

## 1. Stack abstraction
Last In, First Out (LIFO): push adds to the top; pop removes the top; peek reads the top. In modern Java, prefer a Deque implementation such as ArrayDeque for general stack use.

## 2. Fundamental operations
Understand implementation using an array and a linked structure, overflow/underflow considerations in custom implementations, and why each operation is O(1) in typical implementations.

## Part A — Fundamentals
[Part A](01-Part-A-Fundamentals/README.md): operations, balanced parentheses, expression handling and stack patterns.

## Part B — Monotonic stack
[Part B](02-Part-B-Monotonic-Stack/README.md): maintain candidates in monotonic order to solve next greater/smaller, stock span and histogram/range problems.

## Pattern insight
When a problem asks for the next element that is greater/smaller, or for a boundary defined by such elements, consider a monotonic stack. Define whether the stack is increasing/decreasing and whether equal values are kept or removed.

## Checkpoint
Implement a stack using an array, solve valid parentheses and one next-greater problem. Explain the invariant and amortized behavior where relevant.

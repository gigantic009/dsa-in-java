# Recursion — Build the Mental Model First

## Prerequisites
Methods, parameters, return values, loops and basic problem decomposition.

## 1. What is recursion?
A method solves a problem by calling itself on a smaller instance. Every correct recursive method must have a termination condition and progress toward it.

## 2. The two parts
- **Base case:** the smallest instance whose answer is directly known.
- **Recursive case:** reduces the problem and combines/returns the smaller answer.

## 3. Call stack
Each invocation has its own parameters and local variables. Calls wait for the child call to return. Draw the call stack and return sequence rather than treating recursion as magic.

## Fundamentals
See the [fundamentals roadmap](01-Part-A-Fundamentals/README.md) and the corresponding runnable examples for number recursion, Fibonacci, string reversal and palindrome, array recursion, search and fast power.

## Patterns
See [pattern lessons](02-Part-B-Patterns/README.md) for binary strings, subsets and permutations. The README's remaining listed challenges (subsequences, duplicate-aware subsets, combination sum, keypad combinations, palindrome partitioning, maze paths, N-Queens, Sudoku and word search) are aspirational practice prompts unless linked to implemented code.

## Recursion vs backtracking
Backtracking explores choices, then restores state so another choice can be tried. This often follows a choose → recurse → undo structure. Avoid mutation unless state restoration is clear.

## Complexity
Count calls and depth separately. A single chain of n calls may have O(n) stack space; branching recursion may have much more time. State assumptions and recurrence.

## Common mistakes
- Missing or unreachable base case
- Recursive input does not get smaller
- Incorrect return combination
- Mutable state not restored
- Counting stack space incorrectly
- Using recursion where depth may overflow the stack

## Checkpoint
Trace five recursive methods by hand, write five from scratch, explain stack space and solve pattern problems.
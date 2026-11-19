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

## 4. Trace example: factorial
`factorial(n) = n × factorial(n−1)`, with `factorial(0)=1`. This is a mathematical illustration; use a suitable numeric type and consider overflow in code.

## Part A — Fundamentals
[Fundamentals lesson](01-Part-A-Fundamentals/README.md): trace calls, return values, recursion on numbers, arrays and strings; first/last occurrence; sorted check; power.

## Part B — Patterns
[Pattern lesson](02-Part-B-Patterns/README.md): choose/explore/unchoose, subsequences, subsets, permutations, combinations, grid paths, tiling and backtracking.

## 5. Recursion vs backtracking
Backtracking explores choices, then restores state so another choice can be tried. This often follows a choose → recurse → undo structure. Avoid mutation unless state restoration is clear.

## 6. Complexity
Count calls and depth separately. A single chain of n calls may have O(n) stack space; branching recursion may have much more time. State assumptions and recurrence.

## Common mistakes
- Missing or unreachable base case
- Recursive input does not get smaller
- Incorrect return combination
- Mutable state not restored
- Counting stack space incorrectly
- Using recursion where depth may overflow the stack

## Checkpoint
Trace 5 recursive methods by hand, write 5 from scratch, explain stack space and solve 3 new recursion-pattern problems.

# Recursion Fundamentals

Recursion solves a problem by calling the same method on a smaller instance. Every recursive design needs a stopping condition and progress toward that condition.

## The three questions
1. **Base case:** when is the answer already known?
2. **Progress:** how does each call make the problem smaller?
3. **Combine:** how do smaller answers or actions produce the current result?

## Learn in order
1. Call stack and base case
2. [Print numbers in both directions](./PrintNumbersRecursion.java)
3. [Sum](./SumNaturalNumbers.java) and [factorial](./FactorialRecursion.java)
4. [Fibonacci](./FibonacciRecursion.java) — naïve recursion and repeated work
5. [Reverse a string](./RecursiveStringReverse.java) and [recursive palindrome](./RecursivePalindrome.java)
6. [First occurrence](./FirstOccurrence.java) and [check sorted array](./ArraySortedRecursion.java)
7. [Recursive binary search](./RecursiveBinarySearch.java)
8. [Fast power](../02-Part-B-Patterns/FastPower.java) — logarithmic recursion

## Call stack
Each call keeps its local state until its child returns. Calls unwind in reverse order. Deep recursion can exhaust the stack.

## Practice ladder
- Easy: factorial, sum, first occurrence, sorted check, palindrome.
- Medium: Fibonacci, fast power, binary search, tiling, subsets.
- Challenge: multi-branch recursion and memoization.

## Mistakes
- Missing base case or no progress toward it
- Incorrectly combining returned values
- Forgetting to restore mutable state
- Ignoring stack depth or repeated work

## Complexity
- Sum/factorial: O(n) time and O(n) stack
- Naive Fibonacci: exponential time, O(n) stack
- String reverse/palindrome/sorted check: O(n) time, O(n) stack
- Recursive binary search: O(log n) time and stack
- Fast power: O(log n) calls/stack

Test empty, singleton, boundaries, typical inputs, and invalid input.
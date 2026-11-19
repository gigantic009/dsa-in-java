# Recursion Fundamentals

Recursion solves a problem by calling the same method on a smaller instance. Every recursive design needs a stopping condition and progress toward that condition.

## The three questions
1. **Base case:** when is the answer already known?
2. **Progress:** how does each call make the problem smaller?
3. **Combine:** how do smaller answers or actions produce the current result?

## Example: factorial
`n! = n × (n-1)!`, with `0! = 1`.

```java
static long factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

Trace factorial(4): 4 × factorial(3) → 4 × 3 × factorial(2) → 4 × 3 × 2 × factorial(1) → 24.

## Call stack
Each call keeps its local state until its child returns. Calls unwind in reverse order. Deep recursion can exhaust the stack.

## Learn in order
### Fundamentals
- Print numbers in both directions
- Factorial and sum
- Fibonacci (understand why naïve recursion repeats work)
- Recursive palindrome and string reversal
- First/last occurrence in arrays
- Check whether array is sorted
- Recursive binary search

### Patterns
- Fast exponentiation
- Tiling and pairing
- Remove duplicate characters
- Binary strings with constraints
- Subsets and other branching recursion (then backtracking)

## Practice
- Easy: factorial, sum, first/last occurrence, sorted check.
- Medium: fast power, tiling, subsets, Tower of Hanoi.
- Challenge: variations involving multiple recursive branches and memoization.

## Mistakes to avoid
- Missing a base case.
- Base case exists but calls do not progress toward it.
- Returning a value incorrectly from a recursive call.
- Treating recursion as magic instead of tracing the stack.
- Using recursion for a depth that could overflow the Java stack.

## Checkpoint
Draw the call stack for factorial and fast power. Implement two array recursion problems without looking at code.


## Complexity notes
- Factorial recursion: O(n) time and O(n) call-stack space; the demo restricts n to 20 for long.
- First occurrence: O(n) worst-case time and O(n) stack space; start index must be valid and non-negative.
- Fast power: O(log n) recursive calls and O(log n) stack space. The long result can overflow for large bases/exponents.

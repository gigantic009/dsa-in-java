# Loops

## 1. Why loops?
Loops repeat a block while a condition or iteration rule permits. They are used for counting, processing sequences, accumulating values and searching.

## 2. Loop types
- **for:** useful when initialization, condition and update form a clear counting pattern.
- **while:** repeats while a condition is true; update logic is usually inside the body.
- **do-while:** executes the body at least once before checking its condition.

## 3. Entry- and exit-controlled loops
A for/while loop checks before executing its body. A do-while checks after the body, so it executes at least once.

## 4. Control statements
- `break` exits the nearest loop or switch.
- `continue` skips to the next iteration.
- Avoid changing several control variables in ways that make termination hard to understand.

## 5. Nested loops
A loop inside another loop. If both iterate n times, the total work is commonly O(n²), though the actual bound depends on each loop and its relationship.

## 6. Common bugs
- Off-by-one errors: confusing `<` and `<=`.
- Infinite loops: the termination condition never becomes false.
- Overflow in loop variables or arithmetic.
- Incorrectly placed updates.
- Empty or very large input edge cases.

## Practice solutions
- [Factorial using a loop](Factorial.java)
- [Prime number check](PrimeCheck.java)

## Trace exercises
Trace a loop on paper: write the variable values at each iteration, condition result, body action and update. Test zero iterations, one iteration and the termination boundary.

## Complexity
Factorial's loop performs proportional work to n (within the supported range), so O(n) time and O(1) auxiliary space. The prime check tests divisors only up to the square root, so O(√n) time and O(1) auxiliary space.
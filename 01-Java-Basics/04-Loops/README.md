# Loops

## 1. Why loops?
Loops repeat work while a condition or iteration rule permits. They process sequences, count, accumulate, search and automate repetitive tasks.

## 2. Loop types
- **for:** useful when initialization, condition and update form a clear counting pattern.
- **while:** repeats while a condition is true; update logic is generally in the body.
- **do-while:** executes the body at least once before checking the condition.

## 3. Entry- and exit-controlled loops
for/while check before executing the body. do-while checks after the body and therefore executes at least once.

## 4. Control statements
- `break` exits the nearest loop or switch.
- `continue` skips to the next iteration.
- Avoid control-variable changes that make termination difficult to reason about.

## 5. Nested loops
A loop inside another loop. If both iterate n times, work is commonly O(n²), but the exact bound depends on their iteration limits.

## 6. Common bugs
Off-by-one errors, infinite loops, overflow in loop variables, misplaced updates and unexpectedly empty loops.

## Practice
- [Factorial using a loop](Factorial.java)
- [Prime number check](PrimeCheck.java)

## Trace exercises
Write a trace table containing variable values, condition result, body action and update. Test zero iterations, one iteration and the termination boundary. Practise summation, digit extraction and multiplication tables.

## Complexity
Factorial performs proportional work to n: O(n) time and O(1) auxiliary space. The prime check tests divisors through the square root: O(√n) time and O(1) auxiliary space.
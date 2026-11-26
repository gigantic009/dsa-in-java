# Loops

Loops repeat actions. They are fundamental for traversing arrays, counting, searching, accumulating results and implementing many algorithms.

## 1. for loop

Best when the initialization, condition and update form a clear iteration pattern:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Trace: initialization once → condition → body → update → condition again. It ends when the condition becomes false.

## 2. while loop

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

The condition is checked before each iteration. Ensure some action eventually makes the condition false.

## 3. do-while loop

```java
int choice;
do {
    // show menu and read choice
} while (choice != 0);
```

The body executes at least once because the condition is checked afterward.

## 4. break and continue

- `break` exits the nearest loop or switch.
- `continue` skips the remaining body and proceeds to the next iteration.

Use them deliberately. Excessive control-flow jumps make code harder to trace.

## 5. Nested loops

One loop inside another. If each performs n iterations, the total number of body executions is typically n². But count the actual iteration limits rather than applying a rule blindly.

## 6. Common mistakes

- Off-by-one boundaries (`<` vs `<=`).
- Infinite loops due to unchanged conditions.
- Updating the wrong variable.
- Overflow in a counter.
- Assuming a loop runs when its initial condition is false.
- Forgetting that a `do-while` runs at least once.

## Existing examples

- [Factorial](Factorial.java)
- [Prime check](PrimeCheck.java)

Factorial is linear-time for a loop implementation and requires an explicit policy for negative input and overflow. A trial-divisor primality test that checks up to the square root of n is O(√n) time; handle n below 2 as non-prime.

## Trace-table template

| Iteration | Variables | Condition | Action |
|---|---|---|---|
| Start | initial values | first test | — |
| 1 | after body | true/false | action |
| … | … | … | … |
| Exit | final values | false | stop |

## Practice
1. Print 1 to n and n to 1.
2. Sum 1 through n.
3. Print a multiplication table.
4. Count digits and sum digits.
5. Reverse digits (consider negatives and overflow).
6. Check primality.
7. Create a menu that repeats until an exit option is selected.

## Complexity
Analyse the number of iterations and memory used. A single n-iteration loop is usually O(n); nested loops may be O(n²) or another bound.

## Checkpoint
Trace a loop, explain its termination condition, identify an off-by-one error and calculate its complexity.
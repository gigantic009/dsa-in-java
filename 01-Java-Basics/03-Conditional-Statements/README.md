# Conditional Statements

Conditions let a program choose which actions to execute. A condition is an expression that evaluates to a boolean (`true` or `false`).

## 1. if, if-else and else-if

```java
if (condition) {
    // runs if true
} else {
    // runs otherwise
}
```

Use an `else-if` chain for mutually exclusive choices. Branch order matters: a broad condition placed too early can make later branches unreachable.

## 2. Nested decisions

A condition may appear inside another block. Nest only when it clarifies the decision; guard conditions or combined boolean expressions may sometimes be easier to read.

## 3. switch

Use `switch` when selecting among discrete alternatives, such as menu choices. Java supports different switch forms depending on language version. In traditional switch statements, remember `break` to avoid fall-through where appropriate. Modern arrow cases simplify this:

```java
switch (choice) {
    case 1 -> System.out.println("Add");
    case 2 -> System.out.println("View");
    default -> System.out.println("Invalid choice");
}
```

## 4. Worked example: classify a number

```java
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

Trace with `5`, `-5` and `0`. Only one branch executes.

## 5. Boundary testing

For range-based rules, test immediately below, exactly at and immediately above each boundary. For grades, for example, test marks around each cutoff, not just typical values. Define how invalid marks are handled rather than silently assuming.

## 6. Existing examples

- [Even or odd](EvenOrOdd.java)
- [Largest of three numbers](LargestOfThree.java)

Read each example, trace it and test values including zero, negatives, ties and different input order.

## Practice
1. Grade classifier using a clearly specified scale.
2. Leap-year test (divisible by 4, except centuries unless divisible by 400).
3. Menu-based calculator using switch.
4. Determine the largest of three numbers; test ties and negative inputs.
5. Validate a value against a specified range.

## Complexity

These examples evaluate a fixed number of comparisons: O(1) time and O(1) auxiliary space, excluding input/output infrastructure.

## Checkpoint
Explain how branches work, why ordering matters, how switch behaves, and how to test range boundaries.
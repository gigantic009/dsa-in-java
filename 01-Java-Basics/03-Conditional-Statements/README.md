# Conditional Statements

## 1. Why conditions?
Programs choose actions based on boolean expressions. Conditions encode decision rules and validate input.

## 2. Forms
- `if`: execute a block when a condition is true.
- `if-else`: choose one of two branches.
- `else-if`: evaluate a sequence of conditions.
- Nested conditions: decision inside another decision; avoid unnecessary nesting.
- `switch`: select among cases using supported selector types. Modern switch expressions can yield values; syntax depends on Java version.

## 3. Trace an if-else ladder
When the first true branch is encountered, later branches are skipped. Ordering matters: a broad range condition placed first may make a narrower condition unreachable.

## 4. Input validation
Test invalid, boundary and ordinary values. For ranges, test just below, exactly at and just above each boundary.

## 5. Practice solutions
- [Even or odd](EvenOrOdd.java): remainder and a conditional expression.
- [Largest of three numbers](LargestOfThree.java): nested maximum comparison.

## Dry-run prompts
- Even/odd: test 0, 1, -1 and larger positive/negative values.
- Largest: test all equal, two equal maxima, negative values and different input orders.
- Implement a grade classifier, leap-year checker and switch-based menu.

## Complexity
Both practice programs use a constant number of operations: O(1) time and O(1) auxiliary space, excluding input/output infrastructure.
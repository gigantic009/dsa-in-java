# Conditional Statements

## 1. Why conditions?
Programs choose different actions based on expressions that evaluate to boolean. Conditions let you encode decision rules and validate input.

## 2. Forms
- `if`: execute a block when a condition is true.
- `if-else`: choose one of two branches.
- `else-if`: evaluate a sequence of mutually exclusive or priority-based conditions.
- Nested conditions: place one decision inside another; use carefully to avoid excessive nesting.
- `switch`: select among cases using supported selector types. Modern switch expressions can yield values; syntax and supported types depend on the Java version.

## 3. Trace an if-else ladder
When the first true branch is encountered, later branches are skipped. Ordering matters—for example, a broad range condition before a narrow one may prevent the narrow condition from being reached.

## 4. Input validation
Consider invalid, boundary and ordinary values. For range-based conditions, test just below, exactly at and just above each boundary. Avoid assuming the input is valid unless the problem explicitly guarantees it.

## 5. Practice solutions
- [Even or odd](EvenOrOdd.java): remainder and a conditional expression.
- [Largest of three numbers](LargestOfThree.java): nested maximum comparison.

## Dry-run prompts
- Even/odd: test 0, 1, -1 and a larger even/odd number.
- Largest: test all equal, two equal maxima, negative numbers and different ordering.
- Create a grade classifier, leap-year checker and menu using switch.

## Complexity
For the two practice programs, the number of operations does not grow with input magnitude: **O(1) time** and **O(1) auxiliary space**, excluding input/output infrastructure.
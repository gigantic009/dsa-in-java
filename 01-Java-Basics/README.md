# Java Basics — Build the Skills to Solve Problems

This module takes you from writing your first Java program to being able to express the logic of small algorithmic problems in Java. Study the chapter guides in order and practise by typing, tracing, changing and testing the code.

> **Prerequisite:** Foundations (problem statements, pseudocode and dry-running). You do not need prior Java experience.

## Learning outcomes

After completing the module, you should be able to:
- Set up a JDK and compile/run a Java program.
- Understand Java's basic program structure and entry point.
- Declare variables and choose suitable types.
- Read input and display output.
- Use operators and reason about expression evaluation.
- Make decisions with conditional statements.
- Repeat work using loops and avoid accidental infinite loops.
- Write, call and trace methods.
- Solve small problems without copying solutions.
- Recognise common compile-time, runtime and logical errors.

## Start here: compile and run

Check your installation:

```bash
java -version
javac -version
```

Create `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Compile and execute from that folder:

```bash
javac HelloWorld.java
java HelloWorld
```

### Understand each part

- `public`: the method/class is accessible from outside its scope under Java's access rules.
- `class HelloWorld`: declares a class. For this simple file, the public class name matches the filename.
- `main`: the entry point used by the Java launcher in this program.
- `String[] args`: command-line arguments, represented as an array of strings.
- `System.out.println`: prints a line to standard output.
- Braces delimit blocks; semicolons terminate these statements.

Don't memorise all modifiers immediately. Learn to recognise the structure.

## Chapters — follow in order

| Chapter | What you learn | Guide |
|---|---|---|
| 01 | Variables, primitive types, reference types, conversions and overflow | [Variables and Data Types](./01-Variables-and-Data-Types/README.md) |
| 02 | Arithmetic, relational, logical, assignment and other operators | [Operators](./02-Operators/README.md) |
| 03 | if, else-if, else and switch | [Conditional Statements](./03-Conditional-Statements/README.md) |
| 04 | for, while, do-while, break and continue | [Loops](./04-Loops/README.md) |
| 05 | Methods, parameters, return values, scope and reuse | [Functions and Methods](./05-Functions-and-Methods/README.md) |

## The study workflow

For **every** example:

1. Read the code and state what you think it will do.
2. Trace the variables on paper before running it.
3. Type the program yourself.
4. Compile and run.
5. Change at least one input, expression or condition.
6. Predict the changed output before executing.
7. Explain the code in plain language.
8. Try a boundary or unusual case.

## Important skills beyond the five chapters

The chapter sequence is intentionally compact; DSA requires additional Java skills. Learn and practise these before or alongside the corresponding DSA modules:

- **Input:** `Scanner`, `BufferedReader`, token parsing, and the newline trap when mixing `nextInt()` with `nextLine()`.
- **Arrays:** creation, initialization, length, indexing, traversal, updates and passing arrays to methods.
- **Strings:** immutability, `equals()` vs `==`, character access and `StringBuilder`.
- **Classes and objects:** fields, constructors, instance methods and references.
- **Collections:** `ArrayList`, `HashMap`, `HashSet`, `Queue`, `Deque`, and `PriorityQueue`; know when a structure is useful and its basic operations.
- **Recursion:** base case, recursive case, call-stack tracing and termination.
- **Exceptions:** recognising common exceptions and reading error messages.
- **Testing:** normal, boundary and edge cases.

These should be taught in the relevant course modules; this checklist is a bridge, not a substitute for detailed lessons.

## Mini-practice ladder

Solve each without copying. Add input and output where appropriate.

### Level 1 — Output, variables and expressions
1. Print a greeting and your favourite programming goal.
2. Read two integers and print their sum.
3. Convert Celsius to Fahrenheit.
4. Swap two values using a temporary variable.
5. Calculate area and perimeter of a rectangle.

### Level 2 — Decisions
6. Determine even or odd.
7. Determine positive, negative or zero.
8. Find the greater of two and then three numbers.
9. Calculate a grade from a clearly specified marks range.
10. Check whether a year is leap year using the Gregorian rules.

### Level 3 — Loops
11. Print 1 through n.
12. Calculate the sum from 1 through n.
13. Print a multiplication table.
14. Calculate factorial for a valid non-negative input; discuss overflow.
15. Determine whether an integer is prime.
16. Count and sum the digits of a positive integer.
17. Reverse an integer and discuss overflow and negative input policy.

### Level 4 — Methods and composition
18. Write a method that returns the larger of two numbers.
19. Write a method to check evenness.
20. Write a method to calculate factorial.
21. Write a method to test primality.
22. Build a loop-driven menu that calls separate methods for its operations.

## Common mistakes to actively watch for

- Using `=` when a comparison requires `==`.
- Comparing strings with `==` rather than `equals()`.
- Integer division when a decimal result is expected.
- Integer overflow and choosing a type without considering range.
- Off-by-one loop conditions.
- Updating the wrong variable or forgetting to update a loop variable.
- An infinite loop due to a missing/incorrect exit condition.
- Using a variable before initialisation.
- Calling a method with the wrong arguments or expecting a return value from a `void` method.
- Confusing a compile-time error, exception and incorrect algorithm logic.

## Self-assessment gate

- [ ] I can compile and run a Java program from a terminal.
- [ ] I can explain the structure of a simple Java program.
- [ ] I can read input and print output.
- [ ] I understand the basic primitive types and why type choice matters.
- [ ] I can trace arithmetic, relational and logical expressions.
- [ ] I can write conditional logic from a problem statement.
- [ ] I can write loops and trace each iteration.
- [ ] I can write and call methods with parameters and return values.
- [ ] I can debug simple compile-time, runtime and logical errors.
- [ ] I can solve at least 20 of the practice problems independently and explain them.

If a checkpoint is difficult, revisit the relevant chapter and solve smaller examples first.

## What's next?

Continue to [Complexity](../02-Complexity/README.md). Learning Java syntax is only the beginning; understanding how efficiently your solution runs is the next major skill.

---

**Practice rule:** write it yourself, predict its behaviour, run it, test it and explain it.

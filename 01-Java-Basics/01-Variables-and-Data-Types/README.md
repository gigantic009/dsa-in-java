# Variables and Data Types

**Theory-only foundation.** This folder contains concepts, not interview problem files.

## 1. What is a variable?
A variable is a named storage location associated with a type and a value. Java is statically typed: declarations specify the type, and the compiler checks many type-related mistakes before execution.

```java
int age = 20;
age = 21;                 // update the value
final double PI = 3.14159; // constant-like variable
```

Identifiers are case-sensitive. Use descriptive names and lowerCamelCase for variables and methods.

## 2. Primitive types
| Type | Typical size | Notes |
|---|---:|---|
| byte | 8 bits | signed, small integer |
| short | 16 bits | signed integer |
| int | 32 bits | common integer type |
| long | 64 bits | append L to long literals when helpful |
| float | 32 bits | floating point; append F |
| double | 64 bits | usual floating-point type |
| char | 16 bits | UTF-16 code unit |
| boolean | JVM-dependent storage | true or false; not numeric |

Use a type whose range and precision fit the problem. Java does not allow treating boolean as an integer.

## 3. Reference types
Arrays, String instances and objects are reference types. A reference variable can refer to an object or be null. Assignment of a reference copies the reference value, not a deep copy of the object.

## 4. Initialization and scope
- Local variables must be definitely assigned before use.
- Instance fields and static fields receive default values.
- A block determines local-variable scope.
- A variable declared inside a loop body cannot normally be accessed after that block ends.

## 5. Conversion and promotion
- **Widening:** a conversion that can generally represent the source value in a wider type (e.g., int to long).
- **Narrowing:** may lose information and often requires an explicit cast (e.g., double to int).
- Arithmetic on byte, short and char generally promotes to int.
- Integer division discards the fractional part: `7 / 2 == 3`.
- Casting does not make an out-of-range value safe.

## 6. Overflow and floating-point precision
Integer arithmetic can overflow without throwing an exception. Floating-point values represent many decimal fractions approximately; avoid equality comparisons for computed floating-point results when tolerance-based comparisons are more appropriate.

## 7. Memory model—beginner overview
Think of primitives as values and references as values that identify objects. This is a simplified model: JVM memory allocation and optimization are implementation details. Avoid relying on a specific physical stack/heap layout to explain Java semantics.

## Trace and practice
Predict the results before running:
```java
int x = 7 / 2;
double y = 7 / 2;      // integer division occurs before assignment
double z = 7.0 / 2;
int a = (int) 4.9;
```
Then explore: long limits, casting negative numbers, local-variable initialization, reference assignment and null.

## Self-check
Explain the difference between a primitive and a reference; widening and narrowing; integer division and floating-point division; overflow and precision; and local versus field initialization.
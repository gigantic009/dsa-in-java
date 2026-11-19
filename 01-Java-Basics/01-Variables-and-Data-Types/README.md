# Variables and Data Types

**Theory-only foundation.** This folder contains concepts, not interview problem files.

## 1. What is a variable?
A variable is a named storage location associated with a type and a value. Java is statically typed: declarations specify the type, and the compiler checks many type-related mistakes before execution.

```java
int age = 20;
age = 21;
final double PI = 3.14159;
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

Choose a type whose range and precision fit the problem.

## 3. Reference types
Arrays, String instances and objects are reference types. A reference variable can refer to an object or be null. Assignment copies the reference value, not a deep copy of the object.

## 4. Initialization and scope
- Local variables must be definitely assigned before use.
- Instance fields and static fields receive default values.
- A block determines local-variable scope.

## 5. Conversion and promotion
- Widening conversions generally move to a type that can represent the source range.
- Narrowing may lose information and often requires an explicit cast.
- Arithmetic on byte, short and char generally promotes to int.
- Integer division discards the fractional part: `7 / 2 == 3`.
- Casting does not make an out-of-range value safe.

## 6. Overflow and floating-point precision
Integer arithmetic can overflow without throwing an exception. Floating-point values represent many decimal fractions approximately; use tolerance-based comparisons when appropriate.

## 7. Memory—beginner overview
Think of primitives as values and references as values identifying objects. JVM allocation and optimization are implementation details; avoid relying on a particular physical stack/heap layout.

## Trace and practice
Predict results before running:
```java
int x = 7 / 2;
double y = 7 / 2;
double z = 7.0 / 2;
int a = (int) 4.9;
```
Explore long limits, casts, local initialization and reference assignment.

## Self-check
Explain primitive/reference, widening/narrowing, integer/floating division, overflow/precision and local/field initialization.
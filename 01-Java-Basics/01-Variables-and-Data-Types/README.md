# Variables and Data Types

A variable is a named place in a program where a value can be represented and used. Java is statically typed: a variable's declared type constrains the values and operations available to it.

## 1. Declaration, assignment and initialisation

```java
int score;       // declaration
score = 90;      // assignment
int age = 20;    // declaration + initialisation
age = age + 1;   // evaluate right side, then store
final double PI = 3.141592653589793; // constant-like variable
```

A local variable must be assigned before it is used. `final` prevents reassignment of that variable (it does not automatically make an object immutable).

## 2. Primitive types

| Type | Bits | Range / meaning |
|---|---:|---|
| byte | 8 | -128 to 127 |
| short | 16 | -32,768 to 32,767 |
| int | 32 | signed integer |
| long | 64 | signed integer; use `L` suffix for clarity |
| float | 32 | approximate binary floating point; `F` suffix |
| double | 64 | approximate binary floating point |
| char | 16 | UTF-16 code unit |
| boolean | — | true or false |

For typical algorithm problems, `int` is common, but sums, products or constraints may require `long`. A `char` represents a UTF-16 code unit, not necessarily an entire Unicode character.

## 3. Choosing types

Choose according to the problem's possible range and precision, not simply the value in one example. If the input can reach billions, a 32-bit `int` may not be enough for intermediate arithmetic.

```java
int a = 2_000_000_000;
int b = 2_000_000_000;
long sum = (long) a + b; // promote before addition
```

Casting the result after the overflowing addition would be too late: `long sum = a + b;` still evaluates the right-hand side as int first.

## 4. Reference types

Arrays, strings and class instances are reference types. A reference can be `null`. Assignment of a reference copies that reference, not a deep copy of the object.

```java
int[] first = {2, 4, 6};
int[] second = first;
second[0] = 99;
// first[0] is also 99: both references refer to the same array
```

## 5. Conversions and promotion

- Widening conversions are generally allowed when Java can convert the value to a wider type.
- Narrowing conversions may lose information and commonly require explicit casts.
- `byte`, `short` and `char` arithmetic generally promotes to `int`.
- Integer division truncates toward zero: `7 / 2` evaluates to `3`.
- `7.0 / 2` evaluates to `3.5`.
- Casting does not prevent overflow or make an invalid conversion safe.

## 6. Overflow and floating-point precision

Integer arithmetic can overflow without an exception. Floating-point numbers approximate many decimal values; do not assume exact equality for arbitrary decimal calculations.

```java
int x = Integer.MAX_VALUE;
System.out.println(x + 1); // wraps around
double d = 0.1 + 0.2;
System.out.println(d);     // not necessarily exactly 0.3
```

## 7. Scope and default values

Local variables have block scope and must be definitely assigned before use. Fields (instance and static) receive default values, such as 0, false or null, depending on their type.

## 8. Trace practice

Predict each output, then run it:
```java
int x = 7 / 2;
double y = 7 / 2;
double z = 7.0 / 2;
int a = (int) 4.9;
System.out.println(x + " " + y + " " + z + " " + a);
```

Also investigate: integer boundaries, cast behaviour, reference aliasing, local variable initialisation.

## Exercises
1. Declare variables representing a student's name, age, SGPA and whether they passed.
2. Convert a `double` to an `int`; explain the lost information.
3. Demonstrate integer overflow.
4. Predict the result of integer and floating-point division.
5. Copy an array reference, mutate the array, and explain what both variables observe.

## Checkpoint
Explain primitives vs references, scope, widening/narrowing, overflow, precision, and why casting after an overflow is not a remedy.
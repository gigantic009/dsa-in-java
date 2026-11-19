# Functions and Methods

## 1. Method anatomy
A method defines a reusable operation. A declaration includes a return type, name, parameter list and body.
```java
static int add(int a, int b) {
    return a + b;
}
```
- **Return type:** type of returned value, or `void` when no value is returned.
- **Parameters:** local names for values supplied by the caller.
- **Arguments:** actual values supplied during a call.
- **Signature:** method name and parameter types (not return type alone).

## 2. Calling a method
Calling a method transfers control to its body. When it returns, execution continues at the call site. A return value can be stored, printed or passed to another method.

## 3. Java is pass-by-value
Java passes a copy of each argument value. For object arguments, the copied value is a reference: a method can use it to mutate an object, but assigning a different reference to the parameter does not change the caller's variable.

## 4. Scope and lifetime
Local variables and parameters are available within their method/block. Fields belong to objects or classes. Keep variables close to where they are used.

## 5. Overloading
Methods can share a name when parameter lists differ. Return type alone cannot distinguish overloads. Overload selection occurs at compile time.

## 6. Call-stack tracing
For each call, track argument values, local variables, return value and where execution resumes. Recursion uses this same stack concept and is covered separately.

## Practice
- [Sum of two numbers using a method](SumOfTwo.java)

## Dry run
With inputs 4 and 7, trace `sum(4, 7)`: parameters receive the values, the expression evaluates to 11, and the caller prints that return value.

## Complexity
The sum method performs constant work: O(1) time and O(1) auxiliary space.
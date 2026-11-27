# Functions and Methods

Methods allow logic to be named, reused and tested independently. They also help divide a problem into smaller units.

## 1. Anatomy of a method

```java
static int add(int a, int b) {
    return a + b;
}
```

- `static`: this example can be called from the class without creating an instance.
- `int`: return type.
- `add`: method name.
- `int a, int b`: parameters.
- `return`: sends a result back to the caller.

A `void` method does not return a value.

## 2. Calling methods

```java
int result = add(4, 7);
System.out.println(result);
```

The arguments 4 and 7 are passed to the parameters. The method computes its return value; execution resumes at the call site.

## 3. Parameters vs arguments

Parameters are the variables declared in the method definition. Arguments are the values or expressions supplied when calling it.

## 4. Java is pass-by-value

Java always passes a copy of the argument value. When the value is a reference, the copied reference can be used to mutate the same object, but reassigning the parameter does not reassign the caller's variable.

## 5. Scope

Parameters and local variables are accessible in their method/block. Fields belong to instances or classes. Keep variables close to where they are used.

## 6. Overloading

Methods can share a name if their parameter lists differ. Return type alone does not distinguish overloaded methods. Overload selection occurs at compile time.

## 7. Trace a call

For `sum(4, 7)`:
1. Caller evaluates arguments.
2. Parameter `a` receives 4; `b` receives 7.
3. `a + b` evaluates to 11.
4. The method returns 11.
5. Execution resumes at the caller, which can store or print the value.

## Existing example
- [Sum of two numbers](SumOfTwo.java)

## Practice
1. Write methods to add, subtract and multiply.
2. Write a method that returns the larger of two numbers.
3. Write an even/odd method.
4. Write a factorial method.
5. Write a prime-check method.
6. Build a menu that calls methods for each operation.

## Complexity
A method performing a fixed number of operations is O(1) time and O(1) auxiliary space. Complexity depends on what the method does, not on the fact that it is a method.

## Checkpoint
Explain return types, parameters vs arguments, scope, overloading, pass-by-value and tracing a method call.
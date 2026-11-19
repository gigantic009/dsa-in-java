# Inheritance and Polymorphism

## Theory
Inheritance, super, method overriding, overloading, compile-time and runtime polymorphism, final and composition.


## Overriding vs overloading
- **Overloading:** same method name, different parameter list; selected at compile time.
- **Overriding:** subclass provides a compatible implementation of an inherited instance method; selected dynamically for virtual calls.
- Use `@Override` to make intent explicit and catch signature errors.

## Practice checkpoint
Call overridden methods through a superclass reference and explain how the reference type and runtime object type affect the call.

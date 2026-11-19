# Object-Oriented Programming (OOP) in Java

This branch is organized as a learning sequence. OOP is not one topic: learn object construction and encapsulation first, then inheritance, polymorphism, abstraction, and design principles.

## Part 1 — Classes, Objects, Constructors and Encapsulation

- **Class:** a blueprint that declares the state (fields) and behaviour (methods) objects can have.
- **Object:** a runtime instance of a class. Each object has its own instance state.
- **Fields and methods:** fields represent state; methods define behaviour and operations on that state.
- **Constructors:** initialize objects at creation time. Constructors can be overloaded with different parameter lists.
- **this:** refers to the current instance; useful when parameter names overlap field names and when chaining constructors.
- **static:** belongs to the class rather than a particular instance. Static members are shared and can be accessed through the class name.
- **Encapsulation:** protect fields (typically private) and expose controlled operations through methods. This prevents arbitrary state changes and allows validation.
- **Access modifiers:** private, package-private (no modifier), protected, and public determine where members can be accessed.
- **Getters/setters:** use them when controlled access is needed; avoid generating setters for every field automatically if invariants should be protected.

### Practice
Create a Student class, constructors, getters, and a method to display details. Create a BankAccount with a private balance and validated deposit/withdraw operations.

## Part 2 — Inheritance

Inheritance allows a child/subclass to extend the accessible state and behaviour of a parent/superclass. Java uses extends for class inheritance.

- **extends:** establishes an is-a relationship (e.g., Dog extends Animal).
- **super:** refers to the superclass; it can call superclass constructors (super(...)) or methods (super.method()). A superclass constructor call must occur first in a constructor.
- **Constructor chaining:** constructing a subclass also initializes its superclass portion. Java inserts a no-argument super() when appropriate, but explicit calls are needed when the superclass has no accessible no-argument constructor.
- **Method overriding:** a subclass supplies a compatible implementation of an inherited instance method. Use @Override to catch mistakes.
- **final:** a final class cannot be subclassed; a final method cannot be overridden; a final variable cannot be reassigned.
- **Types of inheritance:** Java supports single, multilevel and hierarchical class inheritance. Multiple inheritance of classes is not supported; interfaces provide a way to implement multiple behavioural contracts.
- **Composition vs inheritance:** inheritance models an is-a relationship; composition models has-a relationships and is often more flexible.

### Practice
Build Person → Student (multilevel or simple inheritance), override a method, demonstrate super, and compare an inherited design with a composed design.

## Part 3 — Polymorphism

Polymorphism means the same interface or method call can have different behaviour depending on the overload selected or the actual runtime object.

- **Compile-time polymorphism (overloading):** same method name, different parameter lists. The compiler resolves which overload to call. Return type alone cannot distinguish overloads.
- **Runtime polymorphism (overriding):** a superclass/interface reference can refer to a subclass object. Overridden instance methods are dispatched according to the runtime object's class.
- **Dynamic dispatch:** the runtime implementation of an overridden method is selected for an ordinary instance-method call.
- **Reference vs object type:** the reference type controls which members are available at compile time; the runtime object determines overridden-method behaviour.
- **Limitations/notes:** static methods are hidden rather than overridden; fields are not polymorphically dispatched; constructors are not overridden.

### Practice
Create Animal subclasses with overridden sound() methods and call them through an Animal reference. Separately demonstrate method overloading with different argument lists.

## Part 4 — Abstraction: Abstract Classes and Interfaces

Abstraction exposes what an object can do while hiding implementation details.

- **Abstract class:** declared with abstract; cannot be instantiated directly. It can contain fields, constructors, concrete methods and abstract methods.
- **Abstract methods:** declare a required operation without an implementation; concrete subclasses must implement inherited abstract methods unless they too are abstract.
- **Interface:** defines a contract. Classes use implements; a class can implement multiple interfaces.
- **Interface members:** interfaces can declare abstract methods, constants, default methods and static methods (and private helper methods in modern Java).
- **Abstract class vs interface:** abstract classes can maintain instance state and constructor logic; interfaces are useful for contracts shared across otherwise unrelated types. Java permits extending one class and implementing multiple interfaces.
- **Dependency on abstractions:** code that uses an interface can work with different implementations without being tightly coupled to a concrete class.

### Practice
Implement a PaymentMethod interface with multiple payment implementations, and an abstract Shape class with concrete and abstract methods.

## Part 5 — Object Relationships and Class Design

- **Association:** objects interact or are related without necessarily owning one another.
- **Aggregation:** a weaker whole-part relationship; parts can exist independently of the container.
- **Composition:** a stronger whole-part relationship; the containing object manages or owns the lifecycle of its parts as part of its design.
- **Coupling and cohesion:** reduce unnecessary dependencies between classes and keep responsibilities focused.
- **SOLID overview:** Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation and Dependency Inversion. Treat these as design guidelines, not rigid rules.

### Practice
Model a library, course-registration system or shopping cart using focused classes and object relationships; explain why you chose composition or inheritance for each relationship.

## Recommended learning order
1. Classes, objects, fields and methods
2. Constructors, this, and static
3. Encapsulation and access modifiers
4. Inheritance, super, overriding and final
5. Overloading vs overriding; runtime polymorphism
6. Abstract classes and interfaces
7. Association, aggregation and composition
8. SOLID and basic object-oriented design

## Practice files
Use the Java programs in the subfolders as runnable demonstrations. Their main() methods should collect demonstration data from the user when input is meaningful; reusable methods should continue to accept arguments so they can also be used by tests or coding platforms.


## Sprint teaching expansion

Encapsulation protects invariants; constructors establish valid state; interfaces contracts; composition often beats inheritance. Pair equals/hashCode. Design a small system with polymorphism, validation and separation.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.

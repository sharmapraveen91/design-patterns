# Creational Design Patterns in Java

Creational design patterns are concerned with the process of object creation. These patterns provide different ways to create objects, making the system independent of how its objects are created, composed, and represented.

## Patterns Overview

### 1. **Singleton Pattern**
**Definition**: Ensures a class has only one instance and provides a global point of access to it.

#### Use Case:
- **When to use**:  
  - When you need to ensure that only one instance of a class is created throughout the lifetime of an application.
  - Examples: Database connections, thread pools, logging services, configuration management, or any class that manages global state.

---

### 2. **Factory Method Pattern**
**Definition**: Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.

#### Use Case:
- **When to use**:  
  - When you have a superclass with multiple subclasses, and you want to delegate object creation to the subclasses.
  - Use this pattern when the creation process is complex and you want to hide it from the client code.
  - Examples: GUI libraries where different operating systems require different UI components, or a game engine where you have different types of enemies but need a uniform interface for creating them.

---

### 3. **Abstract Factory Pattern**
**Definition**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

#### Use Case:
- **When to use**:  
  - When your system needs to create multiple families of related objects.
  - Ideal when you have multiple types of related objects, and you want to ensure that the created objects are compatible.
  - Examples: Cross-platform UI systems, where you have to create different sets of UI components (like buttons, text boxes, etc.) for different platforms but they must work together.

---

### 4. **Builder Pattern**
**Definition**: Allows for the step-by-step construction of a complex object, separating the construction process from its representation.

#### Use Case:
- **When to use**:  
  - When an object needs to be created with many optional components, and you want to control the construction process step-by-step.
  - When objects need to be created in different configurations without changing the object's code.
  - Examples: Constructing a `Meal` (with optional items like drinks, sides, etc.), building a complex `Computer` with different configurations (processor, RAM, storage).

---

### 5. **Prototype Pattern**
**Definition**: Creates new objects by copying an existing object, rather than creating a new instance from scratch.

#### Use Case:
- **When to use**:  
  - When object creation is expensive, and you want to clone an existing object to create new instances.
  - Useful when you have complex objects that don’t change often and can be reused across multiple instances.
  - Examples: Creating new `Document` objects by cloning a prototype, or managing object configurations where instances need to be copied.

---

### 6. **Object Pool Pattern**
**Definition**: Manages a pool of reusable objects, minimizing the cost of creating and destroying objects repeatedly.

#### Use Case:
- **When to use**:  
  - When the cost of creating an object is high, and you need a large number of similar objects over the lifetime of the application.
  - Ideal for managing objects like database connections, threads, or network sockets that are expensive to create and maintain.
  - Examples: Managing a pool of database connections or thread pools in a multi-threaded application.

---

## Summary

- **Singleton**: When you need a single, globally accessible instance (e.g., logging, configuration).
- **Factory Method**: When you want to delegate the responsibility of creating objects to subclasses, ensuring flexibility in object creation.
- **Abstract Factory**: When you need to create families of related objects, ensuring compatibility among them (e.g., UI components for different platforms).
- **Builder**: When constructing complex objects step-by-step with different configurations (e.g., building a computer or meal).
- **Prototype**: When object creation is expensive, and you want to clone an existing object instead of creating a new one (e.g., document templates).
- **Object Pool**: When you want to reuse objects from a pool to minimize object creation overhead (e.g., database connections or thread pools).

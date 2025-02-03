# Structural Design Patterns in Java

Structural design patterns focus on simplifying the structure of complex systems by identifying simple ways to compose objects and classes. Here’s a quick summary of each pattern and when to use it:

---

## 1. **Adapter Pattern**

### **Purpose**:  
The Adapter pattern allows incompatible interfaces to work together by providing a wrapper that translates one interface to another.

### **Use Case**:  
Use this pattern when you have an existing class that cannot be directly used because of incompatible interfaces. The Adapter helps to make two incompatible interfaces work together.

### **Example**:  
- You have a `MediaPlayer` interface, and a `VideoPlayer` class, but `VideoPlayer` doesn’t implement `MediaPlayer`. An adapter can wrap `VideoPlayer` to make it compatible with `MediaPlayer`.

---

## 2. **Bridge Pattern**

### **Purpose**:  
The Bridge pattern decouples an abstraction from its implementation so that the two can vary independently.

### **Use Case**:  
Use this pattern when you want to separate an abstraction (like `Shape`) from its implementation (like `Color`) so that both can evolve independently without affecting the other.

### **Example**:  
- A `Shape` class (like `Circle` and `Square`) needs to vary its color (`Red`, `Blue`). Instead of making each `Shape` class responsible for all colors, the Bridge separates them and allows them to change independently.

---

## 3. **Composite Pattern**

### **Purpose**:  
The Composite pattern lets you compose objects into tree-like structures to represent part-whole hierarchies. It treats individual objects and composites uniformly.

### **Use Case**:  
Use this pattern when you need to represent hierarchies or tree structures where individual objects and their compositions (groups of objects) should be treated in the same way.

### **Example**:  
- A graphics editor where you can create a `CompositeGraphic` consisting of multiple simple shapes (`Circle`, `Rectangle`). Each component or composite can be drawn uniformly.

---

## 4. **Decorator Pattern**

### **Purpose**:  
The Decorator pattern allows adding new functionality to an object dynamically without altering its structure.

### **Use Case**:  
Use this pattern when you want to add new responsibilities to an object without modifying its code, and when subclassing is not desirable due to an explosion of subclasses.

### **Example**:  
- You have a `BasicCar` and want to add features like `SportsCar` and `LuxuryCar`. The `Decorator` pattern lets you add features dynamically.

---

## 5. **Facade Pattern**

### **Purpose**:  
The Facade pattern provides a simplified interface to a complex subsystem, making it easier to interact with multiple classes.

### **Use Case**:  
Use this pattern when you have a complex system with multiple subsystems, and you want to simplify the interaction with them by providing a unified interface.

### **Example**:  
- A `HomeTheaterFacade` class can simplify the operation of complex home theater systems by providing a simple interface for turning on/off multiple devices (e.g., `Amplifier`, `Projector`, `DVDPlayer`).

---

## 6. **Flyweight Pattern**

### **Purpose**:  
The Flyweight pattern reduces memory usage by sharing common objects instead of creating new ones, especially for objects that are similar or identical.

### **Use Case**:  
Use this pattern when you need to manage a large number of objects that have many identical parts and you want to save memory by sharing those identical parts.

### **Example**:  
- You are displaying a large number of `Text` objects (like characters `A`, `B`, `C`). Instead of creating a new object for each `A`, `B`, and `C`, the Flyweight pattern can share common objects.

---

## 7. **Proxy Pattern**

### **Purpose**:  
The Proxy pattern provides a surrogate or placeholder for another object, controlling access to it.

### **Use Case**:  
Use this pattern when you need to control access to an object, such as lazy initialization, access control, logging, or remote proxying.

### **Example**:  
- A `RealImage` class that loads and displays images. A `ProxyImage` can delay the loading of the image until it’s needed, helping to optimize performance.

---

## When to Use Each Pattern:

| **Pattern**          | **Use Case**                                                                                                                                               |
|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Adapter**          | When you need to make incompatible interfaces work together.                                                                                             |
| **Bridge**           | When you want to decouple an abstraction from its implementation, allowing both to evolve independently.                                                   |
| **Composite**        | When you need to represent a part-whole hierarchy, and you want to treat individual objects and compositions uniformly.                                     |
| **Decorator**        | When you want to dynamically add new functionality to an object without modifying its structure, avoiding an explosion of subclasses.                      |
| **Facade**           | When you have a complex subsystem and want to provide a simplified interface to interact with it.                                                          |
| **Flyweight**        | When you need to efficiently manage a large number of similar objects by sharing common parts to reduce memory usage.                                        |
| **Proxy**            | When you want to control access to an object, often for purposes such as lazy initialization, access control, or remote access.                            |

---

## Conclusion

Each of the structural design patterns has its own strengths and should be chosen based on the specific problem you're trying to solve. The **Adapter** and **Facade** simplify complex interactions, the **Decorator** allows flexible feature additions, and patterns like **Composite** and **Flyweight** provide ways to optimize and organize object structures.

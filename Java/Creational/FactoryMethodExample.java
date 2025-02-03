// Product Interface
interface Product {
    void create();
}

// Concrete Product
class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Creating ConcreteProductA");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Creating ConcreteProductB");
    }
}

// Creator Abstract Class
abstract class Creator {
    public abstract Product factoryMethod();
}

// Concrete Creator
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.factoryMethod().create();  // Output: Creating ConcreteProductA

        Creator creatorB = new ConcreteCreatorB();
        creatorB.factoryMethod().create();  // Output: Creating ConcreteProductB
    }
}
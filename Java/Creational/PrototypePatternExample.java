// Prototype Interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }
}

public class PrototypePatternExample {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype cloned = (ConcretePrototype) original.clone();
        System.out.println(original.getName());  // Output: Original
        System.out.println(cloned.getName());   // Output: Original
    }
}

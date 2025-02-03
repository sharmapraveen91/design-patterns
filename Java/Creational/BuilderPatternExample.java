// Product
class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }
    public void setPartC(String partC) { this.partC = partC; }

    @Override
    public String toString() {
        return "Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + "]";
    }
}

// Builder Interface
interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}

// Concrete Builder
class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("PartC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

// Director
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.println(product);  // Output: Product [partA=PartA, partB=PartB, partC=PartC]
    }
}

package Structural;

// Implementor
interface Color {
    void applyColor();
}

// Concrete Implementor
class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red color");
    }
}

// Abstraction
abstract class Shape {
    protected Color color;
    abstract void draw();

    public Shape(Color color) {
        this.color = color;
    }
}

// Refined Abstraction
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }
    
    @Override
    void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }
    
    @Override
    void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}


package Structural;

import java.util.ArrayList;
import java.util.List;

// Component
interface Graphic {
    void draw();
}

// Leaf
class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Composite
class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();
    
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }
    
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }
    
    @Override
    public void draw() {
        for(Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}


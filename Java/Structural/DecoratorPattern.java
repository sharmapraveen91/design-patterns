package Structural;

// Component
interface Car {
    void assemble();
}

// Concrete Component
class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}

// Decorator
class CarDecorator implements Car {
    protected Car decoratedCar;
    
    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }
    
    @Override
    public void assemble() {
        this.decoratedCar.assemble();
    }
}

// Concrete Decorators
class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Luxury Car.");
    }
}

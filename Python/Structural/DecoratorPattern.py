# Component
class Car:
    def assemble(self):
        pass

# Concrete Component
class BasicCar(Car):
    def assemble(self):
        print("Basic Car assembled")

# Decorator
class CarDecorator(Car):
    def __init__(self, car):
        self._car = car

    def assemble(self):
        self._car.assemble()

# Concrete Decorators
class SportsCar(CarDecorator):
    def assemble(self):
        self._car.assemble()
        print("Adding features of Sports Car")

class LuxuryCar(CarDecorator):
    def assemble(self):
        self._car.assemble()
        print("Adding features of Luxury Car")

# Client usage
basic_car = BasicCar()
sports_car = SportsCar(basic_car)
sports_car.assemble()

luxury_sports_car = LuxuryCar(sports_car)
luxury_sports_car.assemble()

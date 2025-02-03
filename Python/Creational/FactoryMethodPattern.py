from abc import ABC, abstractmethod

class Product(ABC):
    @abstractmethod
    def create(self):
        pass

class ConcreteProductA(Product):
    def create(self):
        return "Creating ConcreteProductA"

class ConcreteProductB(Product):
    def create(self):
        return "Creating ConcreteProductB"

class Creator(ABC):
    @abstractmethod
    def factory_method(self):
        pass

class ConcreteCreatorA(Creator):
    def factory_method(self):
        return ConcreteProductA()

class ConcreteCreatorB(Creator):
    def factory_method(self):
        return ConcreteProductB()

# Usage
creator = ConcreteCreatorA()
product = creator.factory_method()
print(product.create())  # Output: Creating ConcreteProductA

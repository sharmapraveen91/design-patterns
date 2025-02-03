class AbstractFactory:
    def create_product_a(self):
        pass

    def create_product_b(self):
        pass

class ConcreteFactory1(AbstractFactory):
    def create_product_a(self):
        return "ProductA1"

    def create_product_b(self):
        return "ProductB1"

class ConcreteFactory2(AbstractFactory):
    def create_product_a(self):
        return "ProductA2"

    def create_product_b(self):
        return "ProductB2"

# Usage
factory = ConcreteFactory1()
print(factory.create_product_a())  # Output: ProductA1
print(factory.create_product_b())  # Output: ProductB1

# Component
class Graphic:
    def draw(self):
        pass

# Leaf
class Circle(Graphic):
    def draw(self):
        print("Drawing Circle")

class Rectangle(Graphic):
    def draw(self):
        print("Drawing Rectangle")

# Composite
class CompositeGraphic(Graphic):
    def __init__(self):
        self.graphics = []

    def add(self, graphic):
        self.graphics.append(graphic)

    def draw(self):
        for graphic in self.graphics:
            graphic.draw()

# Client usage
circle = Circle()
rectangle = Rectangle()
composite_graphic = CompositeGraphic()

composite_graphic.add(circle)
composite_graphic.add(rectangle)

composite_graphic.draw()  # Drawing Circle, Drawing Rectangle

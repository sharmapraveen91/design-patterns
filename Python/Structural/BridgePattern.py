# Implementor
class Color:
    def apply_color(self):
        pass

class Red(Color):
    def apply_color(self):
        print("Applying Red color")

class Blue(Color):
    def apply_color(self):
        print("Applying Blue color")

# Abstraction
class Shape:
    def __init__(self, color):
        self.color = color
    
    def draw(self):
        pass

# Refined Abstraction
class Circle(Shape):
    def draw(self):
        print("Drawing Circle with ", end="")
        self.color.apply_color()

class Square(Shape):
    def draw(self):
        print("Drawing Square with ", end="")
        self.color.apply_color()

# Client usage
red = Red()
blue = Blue()

circle = Circle(red)
square = Square(blue)

circle.draw()
square.draw()

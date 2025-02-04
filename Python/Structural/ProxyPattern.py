# Subject
class Image:
    def display(self):
        pass

# RealSubject
class RealImage(Image):
    def __init__(self, filename):
        self.filename = filename
        self.load_image()

    def load_image(self):
        print(f"Loading image: {self.filename}")

    def display(self):
        print(f"Displaying image: {self.filename}")

# Proxy
class ProxyImage(Image):
    def __init__(self, filename):
        self.filename = filename
        self.real_image = None

    def display(self):
        if not self.real_image:
            self.real_image = RealImage(self.filename)
        self.real_image.display()

# Client usage
image1 = ProxyImage("image1.jpg")
image2 = ProxyImage("image2.jpg")

image1.display()  # Loading and displaying
image1.display()  # Only displaying (lazy loading)

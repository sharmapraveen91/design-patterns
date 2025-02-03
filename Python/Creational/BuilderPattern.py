class Computer:
    def __init__(self, processor, ram, storage):
        self.processor = processor
        self.ram = ram
        self.storage = storage

    def __str__(self):
        return f"Computer(Processor: {self.processor}, RAM: {self.ram}, Storage: {self.storage})"

class ComputerBuilder:
    def __init__(self):
        self.processor = None
        self.ram = None
        self.storage = None

    def set_processor(self, processor):
        self.processor = processor
        return self

    def set_ram(self, ram):
        self.ram = ram
        return self

    def set_storage(self, storage):
        self.storage = storage
        return self

    def build(self):
        return Computer(self.processor, self.ram, self.storage)

# Usage
builder = ComputerBuilder()
computer = (builder.set_processor("Intel i7")
                .set_ram("16GB")
                .set_storage("1TB SSD")
                .build())
print(computer)  # Output: Computer(Processor: Intel i7, RAM: 16GB, Storage: 1TB SSD)

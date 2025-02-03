import copy

class Prototype:
    def __init__(self, name):
        self.name = name

    def clone(self):
        return copy.deepcopy(self)

# Usage
prototype = Prototype("Prototype1")
clone = prototype.clone()
print(prototype.name)  # Output: Prototype1
print(clone.name)      # Output: Prototype1
print(prototype is clone)  # Output: False

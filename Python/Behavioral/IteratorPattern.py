class Iterator:
    def __init__(self, collection):
        self.collection = collection
        self.index = 0
    
    def has_next(self):
        return self.index < len(self.collection)

    def next(self):
        if self.has_next():
            item = self.collection[self.index]
            self.index += 1
            return item
        return None

# Usage
names = ["John", "Jane", "Paul"]
iterator = Iterator(names)

while iterator.has_next():
    print(iterator.next())  # Output: John, Jane, Paul

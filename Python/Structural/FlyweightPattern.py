# Flyweight
class Character:
    def print(self):
        pass

# Concrete Flyweights
class A(Character):
    def print(self):
        print("A", end="")

class B(Character):
    def print(self):
        print("B", end="")

# Flyweight Factory
class CharacterFactory:
    _characters = {}

    @staticmethod
    def get_character(key):
        if key not in CharacterFactory._characters:
            if key == "A":
                CharacterFactory._characters[key] = A()
            elif key == "B":
                CharacterFactory._characters[key] = B()
        return CharacterFactory._characters[key]

# Client usage
char_a = CharacterFactory.get_character("A")
char_b = CharacterFactory.get_character("B")

char_a.print()  # A
char_b.print()  # B
# Flyweight
class Character:
    def print(self):
        pass

# Concrete Flyweights
class A(Character):
    def print(self):
        print("A", end="")

class B(Character):
    def print(self):
        print("B", end="")

# Flyweight Factory
class CharacterFactory:
    _characters = {}

    @staticmethod
    def get_character(key):
        if key not in CharacterFactory._characters:
            if key == "A":
                CharacterFactory._characters[key] = A()
            elif key == "B":
                CharacterFactory._characters[key] = B()
        return CharacterFactory._characters[key]

# Client usage
char_a = CharacterFactory.get_character("A")
char_b = CharacterFactory.get_character("B")

char_a.print()  # A
char_b.print()  # B

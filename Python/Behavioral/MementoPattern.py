class Memento:
    def __init__(self, state):
        self.state = state

class Originator:
    def __init__(self):
        self.state = None

    def set_state(self, state):
        self.state = state

    def get_state(self):
        return self.state

    def save_to_memento(self):
        return Memento(self.state)

    def restore_from_memento(self, memento):
        self.state = memento.state

# Usage
originator = Originator()
originator.set_state("State 1")

caretaker = Memento("Saved State")
caretaker.restore_from_memento()

originator.set_state("State 2")
print(f"Current State: {originator.get_state()}")  # Output: Current State: State 2

originator.restore_from_memento(caretaker)
print(f"Restored State: {originator.get_state()}")  # Output: Restored State: State 1

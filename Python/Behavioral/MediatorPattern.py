class Mediator:
    def send(self, message, colleague):
        pass

class ConcreteMediator(Mediator):
    def __init__(self, colleague1, colleague2):
        self.colleague1 = colleague1
        self.colleague2 = colleague2

    def send(self, message, colleague):
        if colleague == self.colleague1:
            self.colleague2.receive(message)
        else:
            self.colleague1.receive(message)

class Colleague:
    def __init__(self, mediator):
        self.mediator = mediator

    def send(self, message):
        self.mediator.send(message, self)

class ConcreteColleague1(Colleague):
    def receive(self, message):
        print(f"Colleague 1 received: {message}")

class ConcreteColleague2(Colleague):
    def receive(self, message):
        print(f"Colleague 2 received: {message}")

# Usage
colleague1 = ConcreteColleague1(None)
colleague2 = ConcreteColleague2(None)
mediator = ConcreteMediator(colleague1, colleague2)

colleague1.mediator = mediator
colleague2.mediator = mediator

colleague1.send("Hello from Colleague 1")  # Output: Colleague 2 received: Hello from Colleague 1
colleague2.send("Hello from Colleague 2")  # Output: Colleague 1 received: Hello from Colleague 2

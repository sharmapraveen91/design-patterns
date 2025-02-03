class State:
    def do_action(self, context):
        pass

class StartState(State):
    def do_action(self, context):
        print("Player is in Start State")
        context.state = self

class StopState(State):
    def do_action(self, context):
        print("Player is in Stop State")
        context.state = self

class Context:
    def __init__(self):
        self.state = None

    def set_state(self, state):
        self.state = state

    def get_state(self):
        return self.state

# Usage
context = Context()

start_state = StartState()
start_state.do_action(context)

print(f"Current State: {context.get_state().__class__.__name__}")

stop_state = StopState()
stop_state.do_action(context)

print(f"Current State: {context.get_state().__class__.__name__}")

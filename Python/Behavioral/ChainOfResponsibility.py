class Handler:
    def __init__(self, next_handler=None):
        self.next_handler = next_handler

    def handle_request(self, request):
        if self.next_handler:
            self.next_handler.handle_request(request)

class ConcreteHandlerA(Handler):
    def handle_request(self, request):
        if request < 10:
            print("Handler A processed the request.")
        else:
            super().handle_request(request)

class ConcreteHandlerB(Handler):
    def handle_request(self, request):
        if request >= 10 and request < 20:
            print("Handler B processed the request.")
        else:
            super().handle_request(request)

# Usage
handler_a = ConcreteHandlerA()
handler_b = ConcreteHandlerB(handler_a)

handler_b.handle_request(15)  # Output: Handler B processed the request.

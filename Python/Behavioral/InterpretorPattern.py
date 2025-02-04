class Expression:
    def interpret(self, context):
        pass

class TerminalExpression(Expression):
    def __init__(self, data):
        self.data = data

    def interpret(self, context):
        return self.data in context

class OrExpression(Expression):
    def __init__(self, expr1, expr2):
        self.expr1 = expr1
        self.expr2 = expr2

    def interpret(self, context):
        return self.expr1.interpret(context) or self.expr2.interpret(context)

# Usage
is_male = TerminalExpression("Male")
is_married = TerminalExpression("Married")

is_male_or_married = OrExpression(is_male, is_married)

print(is_male_or_married.interpret("John is Male"))  # Output: True

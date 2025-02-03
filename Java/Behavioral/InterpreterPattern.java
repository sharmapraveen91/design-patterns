package Behavioral;

interface Expression {
    boolean interpret(String context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}

class OrExpression implements Expression {
    private Expression expr1, expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

public class InterpreterPattern {
    public static void main(String[] args) {
        Expression isMale = new TerminalExpression("Male");
        Expression isMarried = new TerminalExpression("Married");

        Expression isMaleAndMarried = new OrExpression(isMale, isMarried);

        System.out.println("John is Male or Married: " + isMaleAndMarried.interpret("John is Male"));
    }
}


package Behavioral;

abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(int request);
}

class ConcreteHandlerA extends Handler {
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("Handler A processed the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

class ConcreteHandlerB extends Handler {
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Handler B processed the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

public class ChainofResponsibilityPattern {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);

        handlerA.handleRequest(15);
    }
}


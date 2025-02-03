package Behavioral;

abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

class ConcreteMediator extends Mediator {
    private Colleague colleague1;
    private Colleague colleague2;

    public ConcreteMediator(Colleague colleague1, Colleague colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.receive(message);
        } else {
            colleague1.receive(message);
        }
    }
}

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Colleague 1 sending message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Colleague 1 received message: " + message);
    }
}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Colleague 2 sending message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Colleague 2 received message: " + message);
    }
}

public class MediatorPattern {
    public static void main(String[] args) {
        ConcreteColleague1 colleague1 = new ConcreteColleague1(null);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(null);
        ConcreteMediator mediator = new ConcreteMediator(colleague1, colleague2);

        colleague1.send("Hello from Colleague 1");
        colleague2.send("Hello from Colleague 2");
    }
}


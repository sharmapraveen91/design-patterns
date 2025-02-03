package Behavioral;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

class Caretaker {
    private Memento memento;

    public void saveState(Memento memento) {
        this.memento = memento;
    }

    public Memento restoreState() {
        return memento;
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        caretaker.saveState(originator.saveStateToMemento());

        originator.setState("State2");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.restoreState());
        System.out.println("Restored State: " + originator.getState());
    }
}


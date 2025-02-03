package Behavioral;

interface State {
    void doAction(Context context);
}

class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in Start State");
        context.setState(this);
    }
}

class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in Stop State");
        context.setState(this);
    }
}

class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().getClass().getName());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().getClass().getName());
    }
}


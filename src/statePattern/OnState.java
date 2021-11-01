package statePattern;

public class OnState implements State {
    public boolean lookAtLamp(StateContext context) {
        context.setState(new OffState());
        return true;
    }
}

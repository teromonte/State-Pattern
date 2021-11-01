package statePattern;

class OffState implements State {
    @Override
    public boolean lookAtLamp(StateContext context) {
        context.setState(new OnState());
        return false;
    }
}
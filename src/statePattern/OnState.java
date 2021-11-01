package statePattern;

class OnState implements State {



    public boolean lookAtLamp(StateContext context) {
    System.out.println("on");
    context.setState(new OffState());

        return false;
    }
}

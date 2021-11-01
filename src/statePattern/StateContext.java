class StateContext {
    private State state;

    public StateContext() {
        state = new OffState();
    }

    public void setState(State newState) {
        state = newState;
    }

    public boolean lookAtLamp() {
        return state.lookAtLamp(this);
    }
}
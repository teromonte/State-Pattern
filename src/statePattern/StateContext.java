package statePattern;

class StateContext {
    private State state;

    public StateContext() {
        state = new OffState();
    }

    /**
     * Set the current state.
     * Normally only called by classes implementing the statePattern.State interface.
     * @param newState the new state of this context
     */
    void setState(State newState) {
        state = newState;
    }

    public void lookAtLamp(String name) {
        state.lookAtLamp(this);
    }
}
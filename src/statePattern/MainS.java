package statePattern;

public class MainS {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        System.out.println(context.lookAtLamp());
        System.out.println(context.lookAtLamp());
    }
}

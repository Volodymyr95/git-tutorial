package interfaces;

public class Duck implements FlyingBird, Waterfowl {
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {

    }
}

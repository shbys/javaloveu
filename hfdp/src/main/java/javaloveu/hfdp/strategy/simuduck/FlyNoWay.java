package javaloveu.hfdp.strategy.simuduck;

/*
 * The implementation for all ducks that can't fly.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

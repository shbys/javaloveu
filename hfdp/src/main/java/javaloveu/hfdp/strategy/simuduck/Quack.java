package javaloveu.hfdp.strategy.simuduck;

/*
 * The implementation for all ducks that can't fly.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}

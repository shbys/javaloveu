package javaloveu.hfdp.strategy.simuduck;

/*
 * The implementation for all ducks that can't fly.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

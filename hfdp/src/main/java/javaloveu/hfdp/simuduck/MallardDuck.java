package javaloveu.hfdp.simuduck;

/*
 * MallardDuck's quack is a real live duck quack, not a squeak and not a mute quack.
 * When a MallardDuck is instantiated, its constructor initializes the MallardDuck's inherited
 * quackBehavior instance variable to a new instance of type Quack(a QuackBehavior concrete implementation class).
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        _quackBehavior = new Quack();
        _flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

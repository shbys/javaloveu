package javaloveu.hfdp.simuduck;

/*
 * To perform the quack, a Duck just asks the object that is referenced by quackBehavior to quack for it.
 * All we care about is that it knows how to quack
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks floats, even decoys!");
    }

    public abstract void display();
}

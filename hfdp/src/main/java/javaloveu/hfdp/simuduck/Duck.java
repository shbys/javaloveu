package javaloveu.hfdp.simuduck;

/*
 * To perform the quack, a Duck just asks the object that is referenced by quackBehavior to quack for it.
 * All we care about is that it knows how to quack
 */
public abstract class Duck {
    protected FlyBehavior _flyBehavior;
    protected QuackBehavior _quackBehavior;

    public void performQuack() {
        _quackBehavior.quack();
    }

    public void performFly() {
        _flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks floats, even decoys!");
    }

    public abstract void display();

    // ************************************

    /*
     * add setters for flyBehavior and quackBehavior
     * we can set the duck's behavior type through a setter method on the Duck class,
     * rather than by instantiating it in the duck's constructor.
     * we can call these methods anytime we want to change the behavior of a duck on the fly and quack.
     */

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        _flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        _quackBehavior = quackBehavior;
    }

    // ************************************
}

package javaloveu.hfdp.strategy.simuduck;

public class ModelDuck extends Duck{
    public  ModelDuck() {
        _flyBehavior = new FlyNoWay();
        _quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}

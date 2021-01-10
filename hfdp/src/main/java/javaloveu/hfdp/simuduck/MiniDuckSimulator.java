package javaloveu.hfdp.simuduck;

public class MiniDuckSimulator {
    public static void runSimuDuck() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}

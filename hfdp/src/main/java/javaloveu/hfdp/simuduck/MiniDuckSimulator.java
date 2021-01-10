package javaloveu.hfdp.simuduck;

public class MiniDuckSimulator {
    public static void runSimulatorDuck() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

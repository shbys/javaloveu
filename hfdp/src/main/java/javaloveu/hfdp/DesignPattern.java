package javaloveu.hfdp;

import static javaloveu.hfdp.strategy.StrategyPattern.runStrategyPattern;
import static javaloveu.hfdp.observer.ObserverPattern.runObserverPattern;

public class DesignPattern {
    public static void runHeadFirstDesignPattern() {
        runStrategyPattern();
        runObserverPattern();
    }
}

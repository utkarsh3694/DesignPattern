package org.uv.design.DesignPattern.Strategy;

import org.uv.design.DesignPattern.Strategy.Ducks.Duck;
import org.uv.design.DesignPattern.Strategy.Ducks.MallardDuck;
import org.uv.design.DesignPattern.Strategy.Ducks.RubberDuck;
import org.uv.design.DesignPattern.Strategy.Behavior.FlyNoWay;
import org.uv.design.DesignPattern.Strategy.Behavior.FlyWithWings;
import org.uv.design.DesignPattern.Strategy.Behavior.MuteQuack;
import org.uv.design.DesignPattern.Strategy.Behavior.SqueakQuack;
import org.uv.design.DesignPattern.Strategy.Ducks.Duck;
import org.uv.design.DesignPattern.Strategy.Ducks.MallardDuck;
import org.uv.design.DesignPattern.Strategy.Ducks.RubberDuck;

public class StrategyPatternImpl {

    public static void simUDuckApp(){
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        ((MallardDuck) mallardDuck).display();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());

        mallardDuck.getFlyBehavior().fly();
        mallardDuck.getQuackBehavior().quack();

        System.out.println("changing pattern...");

        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new SqueakQuack());

        mallardDuck.getFlyBehavior().fly();
        mallardDuck.getQuackBehavior().quack();

    }

}

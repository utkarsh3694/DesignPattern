package org.uv.design.DesignPattern.Strategy.Ducks;

import org.uv.design.DesignPattern.Strategy.Behavior.FlyBehavior;
import org.uv.design.DesignPattern.Strategy.Behavior.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public Duck() {
    }
}

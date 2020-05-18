package org.uv.design.DesignPattern.Strategy.Behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm Flying with Wings!!!");
    }
}

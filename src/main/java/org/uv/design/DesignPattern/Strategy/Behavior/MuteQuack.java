package org.uv.design.DesignPattern.Strategy.Behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm mute!!!");
    }
}

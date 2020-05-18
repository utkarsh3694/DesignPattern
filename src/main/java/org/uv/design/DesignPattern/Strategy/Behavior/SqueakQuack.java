package org.uv.design.DesignPattern.Strategy.Behavior;

public class SqueakQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm Squeaking...");
    }
}

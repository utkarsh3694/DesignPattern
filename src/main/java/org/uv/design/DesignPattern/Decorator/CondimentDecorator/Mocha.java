package org.uv.design.DesignPattern.Decorator.CondimentDecorator;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
    @Override
    public float getCost() {
        return (20+beverage.getCost());
    }
}

package org.uv.design.DesignPattern.Decorator.CondimentDecorator;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
//        this.description = beverage.description+", Milk";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }

    @Override
    public float getCost() {
        return (25+beverage.getCost());
    }
}

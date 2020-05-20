package org.uv.design.DesignPattern.Decorator.CondimentDecorator;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
   }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public float getCost() {
        return (30+beverage.getCost());
    }
}

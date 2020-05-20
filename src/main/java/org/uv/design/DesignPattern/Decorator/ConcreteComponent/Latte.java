package org.uv.design.DesignPattern.Decorator.ConcreteComponent;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Latte extends Beverage {
    public Latte() {
        description = "Latte";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return 90;
    }
}

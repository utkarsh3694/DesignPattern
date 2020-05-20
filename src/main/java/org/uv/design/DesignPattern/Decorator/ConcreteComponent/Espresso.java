package org.uv.design.DesignPattern.Decorator.ConcreteComponent;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Espresso extends Beverage {
    @Override
    public float getCost() {
        return 100;
    }

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }
}

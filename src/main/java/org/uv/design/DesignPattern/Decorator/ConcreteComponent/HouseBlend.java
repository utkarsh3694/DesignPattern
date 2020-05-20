package org.uv.design.DesignPattern.Decorator.ConcreteComponent;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return 70;
    }
}

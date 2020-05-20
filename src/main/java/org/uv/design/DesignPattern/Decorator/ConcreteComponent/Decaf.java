package org.uv.design.DesignPattern.Decorator.ConcreteComponent;

import org.uv.design.DesignPattern.Decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf";
//        System.out.println("DESCRIPTION: "+description);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return 150;
    }
}

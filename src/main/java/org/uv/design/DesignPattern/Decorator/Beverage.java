package org.uv.design.DesignPattern.Decorator;

public abstract class Beverage {
    public String getDescription() {
        return description;
    }

    public String description = "Beverage ";
    public abstract float getCost();
}

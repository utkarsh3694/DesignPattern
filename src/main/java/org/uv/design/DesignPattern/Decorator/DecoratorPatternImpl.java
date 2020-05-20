package org.uv.design.DesignPattern.Decorator;

import org.uv.design.DesignPattern.Decorator.ConcreteComponent.Decaf;
import org.uv.design.DesignPattern.Decorator.CondimentDecorator.Milk;
import org.uv.design.DesignPattern.Decorator.CondimentDecorator.Mocha;
import org.uv.design.DesignPattern.Decorator.CondimentDecorator.Whip;

public class DecoratorPatternImpl {

    public static void DecoratorPatternImpl(){

        Beverage beverage = new Decaf();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println("Desc: "+beverage.getDescription());
        System.out.println("COST: "+beverage.getCost());
    }

}

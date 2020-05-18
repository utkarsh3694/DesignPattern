package org.uv.design.DesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.uv.design.DesignPattern.Strategy.Behavior.FlyNoWay;
import org.uv.design.DesignPattern.Strategy.Behavior.FlyWithWings;
import org.uv.design.DesignPattern.Strategy.Behavior.MuteQuack;
import org.uv.design.DesignPattern.Strategy.Behavior.SqueakQuack;
import org.uv.design.DesignPattern.Strategy.Ducks.Duck;
import org.uv.design.DesignPattern.Strategy.Ducks.MallardDuck;
import org.uv.design.DesignPattern.Strategy.Ducks.RubberDuck;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		 Duck mallardDuck = new MallardDuck();
		Duck rubberDuck = new RubberDuck();

		((MallardDuck) mallardDuck).display();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.setQuackBehavior(new MuteQuack());

		mallardDuck.getFlyBehavior().fly();
		mallardDuck.getQuackBehavior().quack();

		System.out.println("changing pattern...");

		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new SqueakQuack());

		mallardDuck.getFlyBehavior().fly();
		mallardDuck.getQuackBehavior().quack();


	}

}

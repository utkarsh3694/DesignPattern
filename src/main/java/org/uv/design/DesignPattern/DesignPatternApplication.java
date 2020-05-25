package org.uv.design.DesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.uv.design.DesignPattern.Decorator.DecoratorPatternImpl;
import org.uv.design.DesignPattern.Observer.ObserverPatternImpl;
import org.uv.design.DesignPattern.Singleton.SingletonImpl;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		System.out.println("RUNNING!!!");
//		StrategyPatternImpl.simUDuckApp();
//		ObserverPatternImpl.weatherStation();
//		DecoratorPatternImpl.DecoratorPatternImpl();
		SingletonImpl.singleimpl();
	}

}

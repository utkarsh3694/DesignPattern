package org.uv.design.DesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.uv.design.DesignPattern.Observer.ObserverPattern;
import org.uv.design.DesignPattern.Strategy.StrategyPattern;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		System.out.println("RUNNING!!!");
//		StrategyPattern.simUDuckApp();
		ObserverPattern.weatherStation();
	}

}

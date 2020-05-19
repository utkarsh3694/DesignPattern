package org.uv.design.DesignPattern.Observer;

public class CurrentDisplay implements Observer{

    WeatherData weatherData;

    @Override
    public void update(Data data) {
        WeatherData s = (WeatherData)data;
        weatherData.humidity = s.getHumidity();
        weatherData.temperature = s.getTemperature();
        display();
    }

    public void display(){

        System.out.println("Current values hum: "+weatherData.humidity+" temp: "+weatherData.temperature);

    }

}

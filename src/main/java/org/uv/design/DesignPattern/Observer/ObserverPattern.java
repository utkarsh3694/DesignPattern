package org.uv.design.DesignPattern.Observer;

public class ObserverPattern {
    public static void weatherStation(){

        WeatherData weatherData = new WeatherData(100f,80f);
        WeatherStation weatherStation = new WeatherStation(weatherData);

        CurrentDisplay currentDisplay = new CurrentDisplay();

        weatherStation.addObserver(currentDisplay);

        weatherStation.setWeatherData(new WeatherData(90f,74f));
        weatherStation.setWeatherData(new WeatherData(91f,75f));
        weatherStation.setWeatherData(new WeatherData(92f,76f));
        weatherStation.setWeatherData(new WeatherData(93f,77f));
        weatherStation.setWeatherData(new WeatherData(94f,78f));


    }
}

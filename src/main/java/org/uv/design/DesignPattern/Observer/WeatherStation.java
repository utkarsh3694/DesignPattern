package org.uv.design.DesignPattern.Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject{
    WeatherData weatherData;

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }

    public ArrayList<Observer> observers;

    public WeatherStation(WeatherData weatherData) {
        this.weatherData = weatherData;
        observers = new ArrayList<>();
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(weatherData);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}

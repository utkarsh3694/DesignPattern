package org.uv.design.DesignPattern.Observer;

public class WeatherData implements Data{
    public Float temperature;
    public Float humidity;

    public WeatherData(Float temperature, Float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }
}

package javaloveu.hfdp.observer.weatherstation;

import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private List<Observer> _observers;
    private float _temperature;
    private float _humidity;
    private float _pressure;

    public WeatherData() {
        _observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        _observers.add(o);
    }

    public void removeObserver(Observer o) {
        _observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer observer: _observers) {
            observer.update(_temperature, _humidity, _pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        _temperature = temperature;
        _humidity = humidity;
        _pressure = pressure;
        notifyObservers();
    }
}

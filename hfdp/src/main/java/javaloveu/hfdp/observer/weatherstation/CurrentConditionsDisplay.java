package javaloveu.hfdp.observer.weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float _temperature;
    private float _humidity;
    private WeatherData _weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        _weatherData = weatherData;
        _weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + _temperature
        + "F degrees and " + _humidity + " % humidity");
    }


    public void update(float temperature, float humidity, float pressure) {
        _temperature = temperature;
        _humidity = humidity;
        display();
    }
}

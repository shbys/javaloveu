package javaloveu.hfdp.observer.weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float _maxTemp = 0.0f;
    private float _minTemp = 200;
    private float _tempSum= 0.0f;
    private int _numReadings;
    private WeatherData _weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        _weatherData = weatherData;
        _weatherData.registerObserver(this);
    }

    public void update() {
        float temp = _weatherData.getTemperature();
        _tempSum += temp;
        _numReadings++;

        if (temp > _maxTemp) {
            _maxTemp = temp;
        }

        if (temp < _minTemp) {
            _minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (_tempSum / _numReadings)
                + "/" + _maxTemp + "/" + _minTemp);
    }
}

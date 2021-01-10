package javaloveu.hfdp.observer.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement {
    private float _currentPressure = 29.92f;
    private float _lastPressure;
    private WeatherData _weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        _weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        _lastPressure = _currentPressure;
        _currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (_currentPressure > _lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (_currentPressure == _lastPressure) {
            System.out.println("More of the same");
        } else if (_currentPressure < _lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

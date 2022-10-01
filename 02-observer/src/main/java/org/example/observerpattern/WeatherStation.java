package org.example.observerpattern;

import org.example.observerpattern.observer.CurrentConditionsDisplay;
import org.example.observerpattern.observer.ForecastDisplay;
import org.example.observerpattern.observer.HeatIndexDisplay;
import org.example.observerpattern.observer.StatisticsDisplay;
import org.example.observerpattern.subject.WeatherData;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    new CurrentConditionsDisplay(weatherData);
    new StatisticsDisplay(weatherData);
    new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    System.out.println();
    weatherData.setMeasurements(82, 70, 29.2f);
    System.out.println();
    weatherData.removeObserver(heatIndexDisplay);
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}

package org.example.observerpattern.observer;

import org.example.observerpattern.subject.WeatherData;

public class StatisticsDisplay implements IObserver, IDisplayElement {
  private float maxTemperature = 0.0f;
  private float minTemperature = 200;
  private float temperatureSum = 0.0f;
  private int numberOfReadings;

  public StatisticsDisplay(WeatherData weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    temperatureSum += temp;
    numberOfReadings++;
    if (temp > maxTemperature) {
      maxTemperature = temp;
    }
    if (temp < minTemperature) {
      minTemperature = temp;
    }
    display();
  }

  @Override
  public void display() {
    System.out.printf("Avg/Max/Min temperature: %.1f/%.1f/%.1f%n", temperatureSum / numberOfReadings, maxTemperature, minTemperature);
  }
}

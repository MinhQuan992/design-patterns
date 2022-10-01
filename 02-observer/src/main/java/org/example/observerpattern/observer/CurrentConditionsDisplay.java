package org.example.observerpattern.observer;

import org.example.observerpattern.subject.WeatherData;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
  private final WeatherData weatherData;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}

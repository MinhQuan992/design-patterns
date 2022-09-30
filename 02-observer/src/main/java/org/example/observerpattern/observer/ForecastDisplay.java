package org.example.observerpattern.observer;

import org.example.observerpattern.subject.WeatherData;

public class ForecastDisplay implements IObserver, IDisplayElement {
  private float currentPressure = 29.9f;
  private float lastPressure;

  public ForecastDisplay(WeatherData weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;
    display();
  }

  @Override
  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
}

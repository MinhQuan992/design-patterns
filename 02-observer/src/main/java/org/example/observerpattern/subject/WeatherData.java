package org.example.observerpattern.subject;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.example.observerpattern.observer.IObserver;

@Getter
public class WeatherData implements ISubject {
  private final List<IObserver> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(IObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update();
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}

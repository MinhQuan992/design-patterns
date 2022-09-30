package org.example.observerpattern.observer;

public interface IObserver {
  void update(float temp, float humidity, float pressure);
}

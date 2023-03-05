package org.example.compound.subject;

import java.util.ArrayList;
import java.util.List;
import org.example.compound.observer.Observer;

public class Observable implements QuackObservable {
  private final List<Observer> observers = new ArrayList<>();
  private final QuackObservable duck;

  public Observable(QuackObservable duck) {
    this.duck = duck;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(duck);
    }
  }
}

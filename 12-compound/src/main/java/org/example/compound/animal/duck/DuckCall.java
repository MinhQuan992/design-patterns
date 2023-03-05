package org.example.compound.animal.duck;

import org.example.compound.action.Quackable;
import org.example.compound.subject.Observable;
import org.example.compound.observer.Observer;

public class DuckCall implements Quackable {
  private final Observable observable;

  public DuckCall() {
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Kwak");
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }
}

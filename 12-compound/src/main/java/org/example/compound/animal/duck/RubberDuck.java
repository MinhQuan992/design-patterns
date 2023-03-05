package org.example.compound.animal.duck;

import org.example.compound.action.Quackable;
import org.example.compound.observer.Observer;
import org.example.compound.subject.Observable;

public class RubberDuck implements Quackable {
  private final Observable observable;

  public RubberDuck() {
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Squeak");
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

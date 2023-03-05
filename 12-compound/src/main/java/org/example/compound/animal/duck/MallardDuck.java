package org.example.compound.animal.duck;

import org.example.compound.action.Quackable;
import org.example.compound.subject.Observable;
import org.example.compound.observer.Observer;

public class MallardDuck implements Quackable {
  private final Observable observable;

  public MallardDuck() {
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Quack");
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

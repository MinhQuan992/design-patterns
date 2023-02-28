package org.example.compound.decorator;

import org.example.compound.action.Quackable;
import org.example.compound.observer.Observer;

public class QuackCounter implements Quackable {
  private final Quackable duck;
  public static int numberOfQuacks;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }

  public static int getQuacks() {
    return numberOfQuacks;
  }

  @Override
  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    duck.notifyObservers();
  }
}

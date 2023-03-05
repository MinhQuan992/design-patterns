package org.example.compound.observer;

import org.example.compound.subject.QuackObservable;

public class Quackologist implements Observer {
  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked.");
  }
}

package org.example.compound.adapter;

import org.example.compound.action.Quackable;
import org.example.compound.animal.goose.Goose;
import org.example.compound.observer.Observer;

public class GooseAdapter implements Quackable {
  private final Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }

  @Override
  public void quack() {
    goose.honk();
  }

  @Override
  public void registerObserver(Observer observer) {}

  @Override
  public void notifyObservers() {}
}

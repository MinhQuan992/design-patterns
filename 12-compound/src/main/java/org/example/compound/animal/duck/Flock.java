package org.example.compound.animal.duck;

import java.util.ArrayList;
import java.util.List;
import org.example.compound.action.Quackable;
import org.example.compound.observer.Observer;

public class Flock implements Quackable {
  private final List<Quackable> quackers = new ArrayList<>();

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  @Override
  public void quack() {
    for (Quackable quacker : quackers) {
      quacker.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    for (Quackable quacker : quackers) {
      quacker.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {}
}

package org.example.compound.subject;

import org.example.compound.observer.Observer;

public interface QuackObservable {
  void registerObserver(Observer observer);
  void notifyObservers();
}

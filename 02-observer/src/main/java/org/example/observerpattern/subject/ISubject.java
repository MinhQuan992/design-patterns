package org.example.observerpattern.subject;

import org.example.observerpattern.observer.IObserver;

public interface ISubject {
  void registerObserver(IObserver observer);
  void removeObserver(IObserver observer);
  void notifyObservers();
}

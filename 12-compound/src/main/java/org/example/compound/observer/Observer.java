package org.example.compound.observer;

import org.example.compound.subject.QuackObservable;

public interface Observer {
  void update(QuackObservable duck);
}

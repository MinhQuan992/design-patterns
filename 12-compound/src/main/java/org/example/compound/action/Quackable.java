package org.example.compound.action;

import org.example.compound.subject.QuackObservable;

public interface Quackable extends QuackObservable {
  void quack();
}

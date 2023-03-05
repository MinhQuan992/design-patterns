package org.example.compound.factory;

import org.example.compound.action.Quackable;

public abstract class AbstractDuckFactory {
  public abstract Quackable createMallardDuck();
  public abstract Quackable createRedheadDuck();
  public abstract Quackable createDuckCall();
  public abstract Quackable createRubberDuck();
}

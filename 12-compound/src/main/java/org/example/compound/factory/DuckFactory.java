package org.example.compound.factory;

import org.example.compound.action.Quackable;
import org.example.compound.animal.duck.DuckCall;
import org.example.compound.animal.duck.MallardDuck;
import org.example.compound.animal.duck.RedheadDuck;
import org.example.compound.animal.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }

  @Override
  public Quackable createRedheadDuck() {
    return new RedheadDuck();
  }

  @Override
  public Quackable createDuckCall() {
    return new DuckCall();
  }

  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }
}

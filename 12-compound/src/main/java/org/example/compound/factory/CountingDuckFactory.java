package org.example.compound.factory;

import org.example.compound.action.Quackable;
import org.example.compound.decorator.QuackCounter;
import org.example.compound.animal.duck.DuckCall;
import org.example.compound.animal.duck.MallardDuck;
import org.example.compound.animal.duck.RedheadDuck;
import org.example.compound.animal.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }

  @Override
  public Quackable createRedheadDuck() {
    return new QuackCounter(new RedheadDuck());
  }

  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }
}

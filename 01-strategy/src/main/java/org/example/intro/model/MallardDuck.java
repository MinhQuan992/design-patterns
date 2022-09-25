package org.example.intro.model;

import org.example.intro.algorithm.interfaces.IFlyBehavior;
import org.example.intro.algorithm.interfaces.IQuackBehavior;
import org.example.intro.model.Duck;

public class MallardDuck extends Duck {
  public MallardDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard Duck!");
  }
}

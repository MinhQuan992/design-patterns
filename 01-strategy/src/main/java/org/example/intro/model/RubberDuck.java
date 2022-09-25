package org.example.intro.model;

import org.example.intro.algorithm.interfaces.IFlyBehavior;
import org.example.intro.algorithm.interfaces.IQuackBehavior;

public class RubberDuck extends Duck{
  public RubberDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("Hello World! I'm a cute rubber duck!!!");
  }
}

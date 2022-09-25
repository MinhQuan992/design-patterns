package org.example.intro.model;

import org.example.intro.algorithm.interfaces.IFlyBehavior;
import org.example.intro.algorithm.interfaces.IQuackBehavior;

public abstract class Duck {
  private final IFlyBehavior flyBehavior;
  private final IQuackBehavior quackBehavior;

  public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public abstract void display();

  public void swim() {
    System.out.println("I'm a duck. I can swim!!!");
  }

  // DELEGATE its flying behavior
  public void performFly() {
    flyBehavior.fly();
  }

  // DELEGATE its quack behavior
  public void performQuack() {
    quackBehavior.quack();
  }
}

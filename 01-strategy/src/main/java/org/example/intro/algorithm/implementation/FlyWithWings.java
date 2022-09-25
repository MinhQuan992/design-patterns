package org.example.intro.algorithm.implementation;

import org.example.intro.algorithm.interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I'm a duck flying with two wings!");
  }
}

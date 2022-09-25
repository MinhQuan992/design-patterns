package org.example.intro.algorithm.implementation;

import org.example.intro.algorithm.interfaces.IFlyBehavior;

public class FlyWithRockets implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I fly with two rockets. Hahaha!!!");
  }
}

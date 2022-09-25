package org.example.intro.algorithm.implementation;

import org.example.intro.algorithm.interfaces.IQuackBehavior;

public class Quack implements IQuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack...Quack...Quack...");
  }
}

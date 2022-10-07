package org.example.decoratorpattern.component;

public class Decaf extends Beverage {
  public Decaf() {
    description = "Decaf Coffee";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}

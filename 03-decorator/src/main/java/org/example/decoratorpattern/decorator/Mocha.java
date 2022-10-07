package org.example.decoratorpattern.decorator;

import org.example.decoratorpattern.component.Beverage;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost() + .20;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}

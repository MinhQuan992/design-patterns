package org.example.decoratorpattern.decorator;

import org.example.decoratorpattern.component.Beverage;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost() + .15;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}

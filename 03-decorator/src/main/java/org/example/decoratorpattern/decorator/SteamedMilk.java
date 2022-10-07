package org.example.decoratorpattern.decorator;

import org.example.decoratorpattern.component.Beverage;

public class SteamedMilk extends CondimentDecorator {
  public SteamedMilk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost() + .10;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Steamed Milk";
  }
}

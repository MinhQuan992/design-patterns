package org.example.decoratorpattern.decorator;

import org.example.decoratorpattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public abstract String getDescription();
}

package org.example.decoratorpattern.component;

import lombok.Getter;

@Getter
public abstract class Beverage {
  protected String description = "Unknown Beverage";

  public abstract double cost();
}

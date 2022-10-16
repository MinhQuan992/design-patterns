package org.example.factorypattern.pizzastore;

import org.example.factorypattern.pizza.Pizza;

public abstract class PizzaStore {
  protected abstract Pizza createPizza(PizzaType type);

  public Pizza orderPizza(PizzaType type) {
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}

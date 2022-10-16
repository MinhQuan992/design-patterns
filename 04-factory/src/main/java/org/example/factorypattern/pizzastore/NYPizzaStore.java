package org.example.factorypattern.pizzastore;

import org.example.factorypattern.pizza.NYStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type.equals(PizzaType.CHEESE)) {
      return new NYStyleCheesePizza();
    }
    return null;
  }
}

package org.example.factorypattern.creator;

import org.example.factorypattern.product.NYStyleCheesePizza;
import org.example.factorypattern.product.Pizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type.equals(PizzaType.CHEESE)) {
      return new NYStyleCheesePizza();
    }
    return null;
  }
}

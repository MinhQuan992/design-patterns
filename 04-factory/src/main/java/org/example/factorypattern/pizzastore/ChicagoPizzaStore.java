package org.example.factorypattern.pizzastore;

import org.example.factorypattern.pizza.ChicagoStyleCheesePizza;
import org.example.factorypattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type.equals(PizzaType.CHEESE)) {
      return new ChicagoStyleCheesePizza();
    }
    return null;
  }
}

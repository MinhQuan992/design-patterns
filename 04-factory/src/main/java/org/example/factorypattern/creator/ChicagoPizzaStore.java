package org.example.factorypattern.creator;

import org.example.factorypattern.product.ChicagoStyleCheesePizza;
import org.example.factorypattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type.equals(PizzaType.CHEESE)) {
      return new ChicagoStyleCheesePizza();
    }
    return null;
  }
}

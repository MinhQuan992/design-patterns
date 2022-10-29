package org.example.factorypattern.creator.pizza;

import org.example.factorypattern.creator.ingredient.ChicagoIngredientFactory;
import org.example.factorypattern.creator.ingredient.IPizzaIngredientFactory;
import org.example.factorypattern.product.pizza.CheesePizza;
import org.example.factorypattern.product.pizza.ClamPizza;
import org.example.factorypattern.product.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    IPizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

    if (type.equals(PizzaType.CHEESE)) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style Cheese Pizza");
    } else if (type.equals(PizzaType.CLAM)) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("Chicago Style Clam Pizza");
    }

    return pizza;
  }
}

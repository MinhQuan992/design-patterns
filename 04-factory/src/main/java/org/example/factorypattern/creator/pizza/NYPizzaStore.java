package org.example.factorypattern.creator.pizza;

import org.example.factorypattern.creator.ingredient.IPizzaIngredientFactory;
import org.example.factorypattern.creator.ingredient.NYPizzaIngredientFactory;
import org.example.factorypattern.product.pizza.CheesePizza;
import org.example.factorypattern.product.pizza.ClamPizza;
import org.example.factorypattern.product.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    IPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if (type.equals(PizzaType.CHEESE)) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Cheese Pizza");
    } else if (type.equals(PizzaType.CLAM)) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");
    }

    return pizza;
  }
}

package org.example.factorypattern.product.pizza;

import org.example.factorypattern.creator.ingredient.IPizzaIngredientFactory;

public class CheesePizza extends Pizza {
  public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    showIngredients();
  }
}

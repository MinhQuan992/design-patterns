package org.example.factorypattern.product.pizza;

import org.example.factorypattern.creator.ingredient.IPizzaIngredientFactory;

public class ClamPizza extends Pizza {
  public ClamPizza(IPizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    veggies = ingredientFactory.createVeggies();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam();
    showIngredients();
  }
}

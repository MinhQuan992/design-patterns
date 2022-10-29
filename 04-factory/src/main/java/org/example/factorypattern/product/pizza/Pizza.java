package org.example.factorypattern.product.pizza;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.example.factorypattern.creator.ingredient.IPizzaIngredientFactory;
import org.example.factorypattern.product.ingredient.ICheese;
import org.example.factorypattern.product.ingredient.IClams;
import org.example.factorypattern.product.ingredient.IDough;
import org.example.factorypattern.product.ingredient.IPepperoni;
import org.example.factorypattern.product.ingredient.ISauce;
import org.example.factorypattern.product.ingredient.IVeggies;

@Getter
@Setter
public abstract class Pizza {
  protected IPizzaIngredientFactory ingredientFactory;
  protected String name;

  protected IDough dough;
  protected ISauce sauce;
  protected List<IVeggies> veggies;
  protected ICheese cheese;
  protected IPepperoni pepperoni;
  protected IClams clam;

  public Pizza(IPizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public abstract void prepare();

  public final void showIngredients() {
    System.out.println("Ingredients:");
    if (dough != null) {
      System.out.println("\tDough: " + dough);
    }
    if (sauce != null) {
      System.out.println("\tSauce: " + sauce);
    }
    if (veggies != null && !veggies.isEmpty()) {
      List<String> veggiesInString = veggies.stream().map(IVeggies::toString).toList();
      System.out.println("\tVeggies: " + String.join(", ", veggiesInString));
    }
    if (cheese != null) {
      System.out.println("\tCheese: " + cheese);
    }
    if (pepperoni != null) {
      System.out.println("\tPepperoni: " + pepperoni);
    }
    if (clam != null) {
      System.out.println("\tClam: " + clam);
    }
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }
}

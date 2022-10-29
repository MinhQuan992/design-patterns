package org.example.factorypattern.creator.ingredient;

import java.util.List;
import org.example.factorypattern.product.ingredient.FreshClams;
import org.example.factorypattern.product.ingredient.Garlic;
import org.example.factorypattern.product.ingredient.ICheese;
import org.example.factorypattern.product.ingredient.IClams;
import org.example.factorypattern.product.ingredient.IDough;
import org.example.factorypattern.product.ingredient.IPepperoni;
import org.example.factorypattern.product.ingredient.ISauce;
import org.example.factorypattern.product.ingredient.IVeggies;
import org.example.factorypattern.product.ingredient.MarinaraSauce;
import org.example.factorypattern.product.ingredient.Mushroom;
import org.example.factorypattern.product.ingredient.Onion;
import org.example.factorypattern.product.ingredient.RedPepper;
import org.example.factorypattern.product.ingredient.ReggianoCheese;
import org.example.factorypattern.product.ingredient.SlicedPepperoni;
import org.example.factorypattern.product.ingredient.ThinCrustDough;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {
  @Override
  public IDough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public ISauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public ICheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public List<IVeggies> createVeggies() {
    return List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
  }

  @Override
  public IPepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public IClams createClam() {
    return new FreshClams();
  }
}

package org.example.factorypattern.creator.ingredient;

import java.util.List;
import org.example.factorypattern.product.ingredient.BlackOlives;
import org.example.factorypattern.product.ingredient.EggPlant;
import org.example.factorypattern.product.ingredient.FrozenClams;
import org.example.factorypattern.product.ingredient.ICheese;
import org.example.factorypattern.product.ingredient.IClams;
import org.example.factorypattern.product.ingredient.IDough;
import org.example.factorypattern.product.ingredient.IPepperoni;
import org.example.factorypattern.product.ingredient.ISauce;
import org.example.factorypattern.product.ingredient.IVeggies;
import org.example.factorypattern.product.ingredient.MozzarellaCheese;
import org.example.factorypattern.product.ingredient.PlumTomatoSauce;
import org.example.factorypattern.product.ingredient.SlicedPepperoni;
import org.example.factorypattern.product.ingredient.Spinach;
import org.example.factorypattern.product.ingredient.ThickCrustDough;

public class ChicagoIngredientFactory implements IPizzaIngredientFactory {
  @Override
  public IDough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public ISauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public ICheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public List<IVeggies> createVeggies() {
    return List.of(new EggPlant(), new Spinach(), new BlackOlives());
  }

  @Override
  public IPepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public IClams createClam() {
    return new FrozenClams();
  }
}

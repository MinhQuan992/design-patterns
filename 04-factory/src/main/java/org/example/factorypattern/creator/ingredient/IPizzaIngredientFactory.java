package org.example.factorypattern.creator.ingredient;

import java.util.List;
import org.example.factorypattern.product.ingredient.ICheese;
import org.example.factorypattern.product.ingredient.IClams;
import org.example.factorypattern.product.ingredient.IDough;
import org.example.factorypattern.product.ingredient.IPepperoni;
import org.example.factorypattern.product.ingredient.ISauce;
import org.example.factorypattern.product.ingredient.IVeggies;

public interface IPizzaIngredientFactory {
  IDough createDough();
  ISauce createSauce();
  ICheese createCheese();
  List<IVeggies> createVeggies();
  IPepperoni createPepperoni();
  IClams createClam();
}

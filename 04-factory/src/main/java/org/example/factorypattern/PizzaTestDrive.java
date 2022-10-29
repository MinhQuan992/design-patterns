package org.example.factorypattern;

import org.example.factorypattern.product.pizza.Pizza;
import org.example.factorypattern.creator.pizza.ChicagoPizzaStore;
import org.example.factorypattern.creator.pizza.NYPizzaStore;
import org.example.factorypattern.creator.pizza.PizzaStore;
import org.example.factorypattern.creator.pizza.PizzaType;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza(PizzaType.CLAM);
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}

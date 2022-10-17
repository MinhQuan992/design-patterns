package org.example.factorypattern;

import org.example.factorypattern.product.Pizza;
import org.example.factorypattern.creator.ChicagoPizzaStore;
import org.example.factorypattern.creator.NYPizzaStore;
import org.example.factorypattern.creator.PizzaStore;
import org.example.factorypattern.creator.PizzaType;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}

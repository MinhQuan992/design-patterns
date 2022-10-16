package org.example.factorypattern;

import org.example.factorypattern.pizza.Pizza;
import org.example.factorypattern.pizzastore.ChicagoPizzaStore;
import org.example.factorypattern.pizzastore.NYPizzaStore;
import org.example.factorypattern.pizzastore.PizzaStore;
import org.example.factorypattern.pizzastore.PizzaType;

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

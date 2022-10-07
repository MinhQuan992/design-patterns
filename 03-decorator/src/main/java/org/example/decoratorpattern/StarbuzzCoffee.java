package org.example.decoratorpattern;

import org.example.decoratorpattern.component.Beverage;
import org.example.decoratorpattern.component.DarkRoast;
import org.example.decoratorpattern.component.Espresso;
import org.example.decoratorpattern.component.HouseBlend;
import org.example.decoratorpattern.decorator.Mocha;
import org.example.decoratorpattern.decorator.Soy;
import org.example.decoratorpattern.decorator.Whip;

public class StarbuzzCoffee {
  public static void main(String[] args) {
    String outputFormat = "%s $%.2f%n";
    Beverage espresso = new Espresso();
    System.out.printf(outputFormat, espresso.getDescription(), espresso.cost());

    // TODO: improve the way of creating decorated objects by using Factory or Builder pattern
    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.printf(outputFormat, darkRoast.getDescription(), darkRoast.cost());

    Beverage houseBlend = new HouseBlend();
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip(houseBlend);
    System.out.printf(outputFormat, houseBlend.getDescription(), houseBlend.cost());
  }
}

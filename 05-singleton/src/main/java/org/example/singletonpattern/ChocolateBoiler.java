package org.example.singletonpattern;

import lombok.Getter;

@Getter
public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler instance;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  // If we don't use the 'synchronized' key word here,
  // we can get different boiler objects in multi-threading
  public static synchronized ChocolateBoiler getInstance() {
    if (instance == null) {
      System.out.println("Creating unique instance of ChocolateBoiler");
      instance = new ChocolateBoiler();
    }
    System.out.println("Returning unique instance of ChocolateBoiler");
    return instance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("Fill the boiler with a milk/chocolate mixture");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("Bring the contents to a boil");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("Drain the boiled milk and chocolate");
    }
  }
}

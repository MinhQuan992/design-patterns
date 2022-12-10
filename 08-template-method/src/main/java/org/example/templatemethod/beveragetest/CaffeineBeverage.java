package org.example.templatemethod.beveragetest;

public abstract class CaffeineBeverage {
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();

  abstract void addCondiments();

  final void boilWater() {
    System.out.println("Boiling water");
  }

  final void pourInCup() {
    System.out.println("Pouring into cup");
  }

  // This is a hook method. A subclass can override this to provide its own functionality.
  boolean customerWantsCondiments() {
    return true;
  }
}

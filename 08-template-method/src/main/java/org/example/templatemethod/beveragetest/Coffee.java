package org.example.templatemethod.beveragetest;

public class Coffee extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  // Overrides the hook and provides its own functionality
  @Override
  boolean customerWantsCondiments() {
    String answer = GetUserInputUtil.getUserInput("Would you like milk and sugar with your coffee");
    return answer.toLowerCase().startsWith("y");
  }
}

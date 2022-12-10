package org.example.templatemethod.beveragetest;

public class Tea extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Steeping the Tea");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding Lemon");
  }

  // Overrides the hook and provides its own functionality
  @Override
  boolean customerWantsCondiments() {
    String answer = GetUserInputUtil.getUserInput("Would you like lemon with your tea");
    return answer.toLowerCase().startsWith("y");
  }
}

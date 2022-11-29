package org.example.adapterpattern;

public class DuckTestDrive {
  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    Turkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    Turkey duckAdapter = new DuckAdapter(mallardDuck);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    testDuck(mallardDuck);

    System.out.println("\nThe TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    System.out.println("\nThe DuckAdapter says...");
    duckAdapter.gobble();
    duckAdapter.fly();
  }

  private static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}

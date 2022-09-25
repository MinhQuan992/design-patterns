package org.example.intro;

import org.example.intro.algorithm.implementation.FlyWithRockets;
import org.example.intro.algorithm.implementation.FlyWithWings;
import org.example.intro.algorithm.implementation.MuteQuack;
import org.example.intro.algorithm.implementation.Quack;
import org.example.intro.algorithm.implementation.Squeak;
import org.example.intro.model.Duck;
import org.example.intro.model.MallardDuck;
import org.example.intro.model.RubberDuck;

public class DuckSimulator {
  public static void main(String[] args) {
    FlyWithWings flyWithWings = new FlyWithWings();
    FlyWithRockets flyWithRockets = new FlyWithRockets();

    Quack quack = new Quack();
    Squeak squeak = new Squeak();
    MuteQuack muteQuack = new MuteQuack();

    MallardDuck mallardDuck = new MallardDuck(flyWithWings, quack);
    performActions(mallardDuck);

    System.out.println();

    RubberDuck rubberDuck = new RubberDuck(flyWithRockets, squeak);
    performActions(rubberDuck);

    // Change rubberDuck's quack behavior at runtime
    rubberDuck.setQuackBehavior(muteQuack);
    System.out.println("\nRubber Duck's quack behavior has been changed");
    performActions(rubberDuck);
  }

  private static void performActions(Duck duck) {
    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();
  }
}

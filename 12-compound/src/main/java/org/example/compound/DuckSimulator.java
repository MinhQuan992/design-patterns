package org.example.compound;

import org.example.compound.action.Quackable;
import org.example.compound.adapter.GooseAdapter;
import org.example.compound.decorator.QuackCounter;
import org.example.compound.animal.duck.Flock;
import org.example.compound.factory.AbstractDuckFactory;
import org.example.compound.animal.goose.Goose;
import org.example.compound.observer.Quackologist;

public class DuckSimulator {
  public void simulate(AbstractDuckFactory duckFactory) {
    System.out.println("Duck Simulator");

    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseAdapter = new GooseAdapter(new Goose());

    Flock flockOfDucks = new Flock();
    addDucksToFlock(flockOfDucks, redheadDuck, duckCall, rubberDuck, gooseAdapter);

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();

    Flock flockOfMallards = new Flock();
    addDucksToFlock(flockOfMallards, mallardOne, mallardTwo, mallardThree, mallardFour);
    addDucksToFlock(flockOfDucks, flockOfMallards);

    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);

    System.out.println("\nWhole Flock Simulation");
    simulate(flockOfDucks);

    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }

  public void addDucksToFlock(Flock flock, Quackable... ducks) {
    for (Quackable duck: ducks) {
      flock.add(duck);
    }
  }

  public void simulate(Quackable duck) {
    duck.quack();
  }
}

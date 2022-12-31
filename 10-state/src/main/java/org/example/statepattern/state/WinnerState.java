package org.example.statepattern.state;

import org.example.statepattern.context.GumballMachine;

public class WinnerState implements GumballMachineState {
  private final GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball!");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
      }
    }
  }

  @Override
  public void refill() {

  }
}

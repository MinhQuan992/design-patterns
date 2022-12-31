package org.example.statepattern.state;

import org.example.statepattern.context.GumballMachine;

public class SoldOutState implements GumballMachineState {
  private final GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  @Override
  public void refill() {
    gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
  }
}

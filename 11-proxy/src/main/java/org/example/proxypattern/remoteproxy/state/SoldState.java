package org.example.proxypattern.remoteproxy.state;

import java.io.Serial;
import org.example.proxypattern.remoteproxy.context.GumballMachine;

public class SoldState implements GumballMachineState {
  @Serial
  private static final long serialVersionUID = 2L;
  private transient final GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
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
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
    }
  }

  @Override
  public void refill() {

  }
}

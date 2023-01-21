package org.example.proxypattern.remoteproxy.state;

import java.io.Serial;
import org.example.proxypattern.remoteproxy.context.GumballMachine;

public class SoldOutState implements GumballMachineState {
  @Serial
  private static final long serialVersionUID = 2L;
  private transient final GumballMachine gumballMachine;

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

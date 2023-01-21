package org.example.proxypattern.remoteproxy.state;

import java.io.Serial;
import java.util.Random;
import org.example.proxypattern.remoteproxy.context.GumballMachine;

public class HasQuarterState implements GumballMachineState {
  @Serial
  private static final long serialVersionUID = 2L;
  private transient final GumballMachine gumballMachine;
  private final Random randomWinner = new Random(System.currentTimeMillis());

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert another quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    if (winner == 0 && gumballMachine.getCount() > 1) {
      gumballMachine.setCurrentState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  @Override
  public void refill() {

  }
}

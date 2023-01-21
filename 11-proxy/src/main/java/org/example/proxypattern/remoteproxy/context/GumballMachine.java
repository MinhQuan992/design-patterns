package org.example.proxypattern.remoteproxy.context;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lombok.Getter;
import org.example.proxypattern.remoteproxy.state.GumballMachineState;
import org.example.proxypattern.remoteproxy.state.HasQuarterState;
import org.example.proxypattern.remoteproxy.state.NoQuarterState;
import org.example.proxypattern.remoteproxy.state.SoldOutState;
import org.example.proxypattern.remoteproxy.state.SoldState;
import org.example.proxypattern.remoteproxy.state.WinnerState;

@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
  private final GumballMachineState soldOutState;
  private final GumballMachineState noQuarterState;
  private final GumballMachineState hasQuarterState;
  private final GumballMachineState soldState;
  private final GumballMachineState winnerState;
  private final String location;

  private GumballMachineState currentState;
  private int count;

  public GumballMachine(String location, int numberGumballs) throws RemoteException {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.location = location;
    count = numberGumballs;

    if (numberGumballs > 0) {
      currentState = noQuarterState;
    } else {
      currentState = soldOutState;
    }
  }

  public void insertQuarter() {
    currentState.insertQuarter();
  }

  public void ejectQuarter() {
    currentState.ejectQuarter();
  }

  public void turnCrank() {
    currentState.turnCrank();
    if (currentState instanceof SoldState || currentState instanceof WinnerState) {
      currentState.dispense();
      // 'dispense' is just an internal action; a user can't ask the machine to dispense directly.
    }
  }

  public void refill(int numberGumballs) {
    count += numberGumballs;
    System.out.println("The gumball machine was just refilled; its new count is: " + count);
    currentState.refill();
  }

  public void setCurrentState(GumballMachineState currentState) {
    this.currentState = currentState;
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count > 0) {
      count--;
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2022");
    result.append("\nInventory: ")
        .append(count)
        .append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is ")
        .append(currentState instanceof SoldOutState ? "sold out" : "waiting for quarter")
        .append("\n");
    return result.toString();
  }
}

package org.example.proxypattern.remoteproxy.context;

import java.rmi.RemoteException;

public class GumballMonitor {
  private final GumballMachineRemote machine;

  public GumballMonitor(GumballMachineRemote machine) {
    this.machine = machine;
  }

  public void report() {
    try {
      System.out.println("Gumball Machine: " + machine.getLocation());
      System.out.println("Current inventory: " + machine.getCount() + " gumballs");
      System.out.println("Current state: " + machine.getCurrentState());
    } catch (RemoteException ex) {
      ex.printStackTrace();
    }
  }
}

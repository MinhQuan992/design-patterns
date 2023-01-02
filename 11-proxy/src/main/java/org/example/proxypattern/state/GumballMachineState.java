package org.example.proxypattern.state;

public interface GumballMachineState {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
  void refill();
}

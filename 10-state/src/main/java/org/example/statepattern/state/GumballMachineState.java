package org.example.statepattern.state;

public interface GumballMachineState {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
  void refill();
}

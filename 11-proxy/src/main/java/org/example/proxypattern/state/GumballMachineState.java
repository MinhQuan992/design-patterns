package org.example.proxypattern.state;

import java.io.Serializable;

public interface GumballMachineState extends Serializable {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
  void refill();
}

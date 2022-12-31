package org.example.statepattern;

import org.example.statepattern.context.GumballMachine;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuarter();

    System.out.println(gumballMachine);

    gumballMachine.refill(3);
    System.out.println(gumballMachine);
  }
}

package org.example.compound;

import org.example.compound.factory.AbstractDuckFactory;
import org.example.compound.factory.CountingDuckFactory;

public class DuckSimulatorTestDrive {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }
}

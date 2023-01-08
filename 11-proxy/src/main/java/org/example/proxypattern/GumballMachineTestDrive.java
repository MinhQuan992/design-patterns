package org.example.proxypattern;

import java.rmi.Naming;
import org.example.proxypattern.context.GumballMachine;
import org.example.proxypattern.context.GumballMachineRemote;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("GumballMachine <name> <inventory>");
      System.exit(1);
    }

    try {
      int count = Integer.parseInt(args[1]);
      GumballMachineRemote gumballMachineRemote = new GumballMachine(args[0], count);
      Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachineRemote);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

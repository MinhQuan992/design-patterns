package org.example.proxypattern.remoteproxy;

import java.rmi.Naming;
import org.example.proxypattern.remoteproxy.context.GumballMachine;
import org.example.proxypattern.remoteproxy.context.GumballMachineRemote;

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

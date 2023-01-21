package org.example.proxypattern.remoteproxy;

import java.rmi.Naming;
import org.example.proxypattern.remoteproxy.context.GumballMachineRemote;
import org.example.proxypattern.remoteproxy.context.GumballMonitor;

public class GumballMonitorTestDrive {
  public static void main(String[] args) {
    String[] location = {
        "rmi://austin.mightygumball.com/gumballmachine"
    };
    GumballMonitor[] monitors = new GumballMonitor[location.length];

    for (int i = 0; i < location.length; i++) {
      try {
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitors[i] = new GumballMonitor(machine);
        System.out.println(monitors[i]);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    for (GumballMonitor monitor : monitors) {
      monitor.report();
    }
  }
}

package org.example.proxypattern.context;

import java.rmi.Remote;
import java.rmi.RemoteException;
import org.example.proxypattern.state.GumballMachineState;

public interface GumballMachineRemote extends Remote {
  int getCount() throws RemoteException;
  String getLocation() throws RemoteException;
  GumballMachineState getCurrentState() throws RemoteException;
}

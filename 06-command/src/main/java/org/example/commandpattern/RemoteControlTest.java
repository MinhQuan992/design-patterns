package org.example.commandpattern;

import org.example.commandpattern.command.GarageDoorOpenCommand;
import org.example.commandpattern.command.LightOnCommand;
import org.example.commandpattern.receiver.GarageDoor;
import org.example.commandpattern.receiver.Light;

public class RemoteControlTest {
  public static void main(String[] args) {
    // Create an Invoker
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    // Create a command and pass the Receiver to it
    LightOnCommand lightOn = new LightOnCommand(new Light());
    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(new GarageDoor());
    // Pass the command to the Invoker
    simpleRemoteControl.setCommand(lightOn);
    simpleRemoteControl.executeCommand();
    simpleRemoteControl.setCommand(garageDoorOpen);
    simpleRemoteControl.executeCommand();
  }
}

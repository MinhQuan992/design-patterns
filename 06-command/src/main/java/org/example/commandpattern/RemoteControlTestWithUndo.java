package org.example.commandpattern;

import org.example.commandpattern.command.CeilingFanHighCommand;
import org.example.commandpattern.command.CeilingFanMediumCommand;
import org.example.commandpattern.command.CeilingFanOffCommand;
import org.example.commandpattern.receiver.CeilingFan;

public class RemoteControlTestWithUndo {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    CeilingFan ceilingFan = new CeilingFan(Location.LIVING_ROOM);

    CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
    CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
    remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(1);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.undoButtonWasPushed();
    remoteControl.undoButtonWasPushed();
  }
}

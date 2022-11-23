package org.example.commandpattern;

import org.example.commandpattern.command.HottubOffCommand;
import org.example.commandpattern.command.HottubOnCommand;
import org.example.commandpattern.command.ICommand;
import org.example.commandpattern.command.LightOffCommand;
import org.example.commandpattern.command.LightOnCommand;
import org.example.commandpattern.command.MacroCommand;
import org.example.commandpattern.command.StereoOffCommand;
import org.example.commandpattern.command.StereoOnWithCDCommand;
import org.example.commandpattern.receiver.Hottub;
import org.example.commandpattern.receiver.Light;
import org.example.commandpattern.receiver.Stereo;

public class RemoteControlTestWithMacro {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light(Location.LIVING_ROOM);
    Stereo stereo = new Stereo(Location.LIVING_ROOM);
    Hottub hottub = new Hottub();

    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
    HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
    HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

    ICommand[] partyOnCommands = { lightOnCommand, stereoOnWithCDCommand, hottubOnCommand };
    ICommand[] partyOffCommands = { lightOffCommand, stereoOffCommand, hottubOffCommand };

    MacroCommand partyOnMacro = new MacroCommand(partyOnCommands);
    MacroCommand partyOffMacro = new MacroCommand(partyOffCommands);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On ---");
    remoteControl.onButtonWasPushed(0);
    System.out.println("--- Pushing Macro Off ---");
    remoteControl.offButtonWasPushed(0);
  }
}

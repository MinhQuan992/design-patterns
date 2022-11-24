package org.example.commandpattern;

import org.example.commandpattern.command.CeilingFanOffCommand;
import org.example.commandpattern.command.CeilingFanHighCommand;
import org.example.commandpattern.command.GarageDoorDownCommand;
import org.example.commandpattern.command.GarageDoorUpCommand;
import org.example.commandpattern.command.LightOffCommand;
import org.example.commandpattern.command.LightOnCommand;
import org.example.commandpattern.command.StereoOffCommand;
import org.example.commandpattern.command.StereoOnWithCDCommand;
import org.example.commandpattern.receiver.CeilingFan;
import org.example.commandpattern.receiver.GarageDoor;
import org.example.commandpattern.receiver.Light;
import org.example.commandpattern.receiver.Stereo;

public class RemoteControlTest {
  public static void main(String[] args) {
    // Create an Invoker
    RemoteControl remoteControl = new RemoteControl();

    // Create all Receivers
    Light livingRoomLight = new Light(Location.LIVING_ROOM);
    Light kitchenLight = new Light(Location.KITCHEN);
    CeilingFan ceilingFan = new CeilingFan(Location.LIVING_ROOM);
    GarageDoor garageDoor = new GarageDoor(Location.GARAGE);
    Stereo stereo = new Stereo(Location.LIVING_ROOM);

    // Create all Commands
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);

    // Load all commands into the Invoker
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
    remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

    System.out.println(remoteControl);

    for (int i = 0; i < 7; i++) {
      remoteControl.onButtonWasPushed(i);
      remoteControl.offButtonWasPushed(i);
    }
  }
}

package org.example.commandpattern.command;

import org.example.commandpattern.receiver.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
  private final GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }

  @Override
  public void undo() {

  }
}

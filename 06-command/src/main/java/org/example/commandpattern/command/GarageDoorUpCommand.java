package org.example.commandpattern.command;

import org.example.commandpattern.receiver.GarageDoor;

public class GarageDoorUpCommand implements ICommand {
  private final GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }

  @Override
  public void undo() {
    garageDoor.down();
  }
}

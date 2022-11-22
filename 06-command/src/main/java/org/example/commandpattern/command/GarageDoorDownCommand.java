package org.example.commandpattern.command;

import org.example.commandpattern.receiver.GarageDoor;

public class GarageDoorDownCommand implements ICommand {
  private final GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    garageDoor.down();
  }

  @Override
  public void undo() {
    garageDoor.up();
  }
}

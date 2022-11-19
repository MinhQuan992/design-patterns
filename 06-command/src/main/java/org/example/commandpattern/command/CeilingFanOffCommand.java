package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanOffCommand implements ICommand {
  private final CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.off();
  }

  @Override
  public void undo() {

  }
}

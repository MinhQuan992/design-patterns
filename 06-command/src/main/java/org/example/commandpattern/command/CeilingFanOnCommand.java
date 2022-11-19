package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
  private final CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.high();
  }

  @Override
  public void undo() {

  }
}

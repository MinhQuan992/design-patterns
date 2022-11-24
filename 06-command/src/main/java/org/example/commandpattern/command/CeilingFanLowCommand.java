package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {
  public CeilingFanLowCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.low();
  }
}

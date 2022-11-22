package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {
  public CeilingFanMediumCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }
}

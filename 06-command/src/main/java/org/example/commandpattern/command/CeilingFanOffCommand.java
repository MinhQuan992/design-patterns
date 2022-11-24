package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {
  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }
}

package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }
}

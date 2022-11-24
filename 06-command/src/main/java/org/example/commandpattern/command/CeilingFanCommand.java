package org.example.commandpattern.command;

import org.example.commandpattern.receiver.CeilingFan;

public abstract class CeilingFanCommand implements ICommand {
  protected final CeilingFan ceilingFan;
  protected int previousSpeed;

  public CeilingFanCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void undo() {
    if (previousSpeed == CeilingFan.HIGH) {
      ceilingFan.high();
    } else if (previousSpeed == CeilingFan.MEDIUM) {
      ceilingFan.medium();
    } else if (previousSpeed == CeilingFan.LOW) {
      ceilingFan.low();
    } else {
      ceilingFan.off();
    }
  }
}

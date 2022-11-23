package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Hottub;

public class HottubOffCommand implements ICommand {
  private final Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.setTemperature(98);
    hottub.off();
  }

  @Override
  public void undo() {
    hottub.on();
    hottub.setTemperature(104);
    hottub.circulate();
  }
}

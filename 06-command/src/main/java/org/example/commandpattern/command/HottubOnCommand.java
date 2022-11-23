package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Hottub;

public class HottubOnCommand implements ICommand {
  private final Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.on();
    hottub.setTemperature(104);
    hottub.circulate();
  }

  @Override
  public void undo() {
    hottub.off();
  }
}

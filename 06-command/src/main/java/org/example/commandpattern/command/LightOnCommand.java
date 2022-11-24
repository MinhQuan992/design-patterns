package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Light;

public class LightOnCommand implements ICommand {
  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

  @Override
  public void undo() {
    light.off();
  }
}

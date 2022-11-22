package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Light;

public class LightOffCommand implements ICommand {
  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}

package org.example.commandpattern;

import org.example.commandpattern.command.ICommand;

public class SimpleRemoteControl {
  private ICommand command;

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }
}

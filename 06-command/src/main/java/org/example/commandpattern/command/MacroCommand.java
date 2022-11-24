package org.example.commandpattern.command;

public class MacroCommand implements ICommand {
  private final ICommand[] commands;

  public MacroCommand(ICommand[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    for (ICommand command : commands) {
      command.execute();
    }
  }

  @Override
  public void undo() {
    for (int i = commands.length - 1; i >= 0; i--) {
      commands[i].undo();
    }
  }
}

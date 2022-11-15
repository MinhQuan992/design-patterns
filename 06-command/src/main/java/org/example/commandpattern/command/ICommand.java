package org.example.commandpattern.command;

public interface ICommand {
  void execute();
  void undo();
}

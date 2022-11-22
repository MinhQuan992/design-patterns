package org.example.commandpattern;

import org.example.commandpattern.command.ICommand;
import org.example.commandpattern.command.NoCommand;

public class RemoteControl {
  private final ICommand[] onCommands;
  private final ICommand[] offCommands;
  private ICommand previousCommand;

  public RemoteControl() {
    onCommands = new ICommand[7];
    offCommands = new ICommand[7];

    ICommand noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }

    previousCommand = noCommand;
  }

  public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    previousCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    previousCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    previousCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n-------- Remote Control --------\n");
    String slotDescriptionFormat = "[Slot %d] %s\t%s\n";
    for (int i = 0; i < onCommands.length; i++) {
      stringBuilder.append(String.format(slotDescriptionFormat,
          i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName()));
    }
    stringBuilder
        .append("[Undo]\t")
        .append(previousCommand.getClass().getSimpleName())
        .append("\n");
    return stringBuilder.toString();
  }
}

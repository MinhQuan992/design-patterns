package org.example.commandpattern;

import java.util.List;
import java.util.Stack;
import org.example.commandpattern.command.ICommand;
import org.example.commandpattern.command.NoCommand;

public class RemoteControl {
  private final ICommand[] onCommands;
  private final ICommand[] offCommands;
  private final Stack<ICommand> previousCommands;

  public RemoteControl() {
    onCommands = new ICommand[7];
    offCommands = new ICommand[7];

    ICommand noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }

    previousCommands = new Stack<>();
    previousCommands.push(noCommand);
  }

  public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    previousCommands.push(onCommands[slot]);
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    previousCommands.push(offCommands[slot]);
  }

  public void undoButtonWasPushed() {
    if (previousCommands.peek() instanceof NoCommand) {
      System.out.println("No actions left to undo");
    }
    previousCommands.pop().undo();
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
        .append(showPreviousCommands())
        .append("\n");
    return stringBuilder.toString();
  }

  private String showPreviousCommands() {
    List<String> previousCommandsInString = previousCommands
        .stream()
        .map(command -> command.getClass().getSimpleName())
        .toList();
    return String.join(", ", previousCommandsInString);
  }
}

package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Stereo;

public class StereoOnWithCDCommand implements ICommand {
  private final Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}

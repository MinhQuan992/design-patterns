package org.example.commandpattern.command;

import org.example.commandpattern.receiver.Stereo;

public class StereoOffCommand implements ICommand {
  private final Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }
}

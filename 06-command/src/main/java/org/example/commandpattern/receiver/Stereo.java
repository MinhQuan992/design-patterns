package org.example.commandpattern.receiver;

import org.example.commandpattern.Location;

public class Stereo {
  private final Location location;

  public Stereo(Location location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + " stereo is on");
  }

  public void off() {
    System.out.println(location + " stereo is off");
  }

  public void setCD() {
    System.out.println(location + " stereo is set for CD input");
  }

  public void setDVD() {
    System.out.println(location + " stereo is set for DVD input");
  }

  public void setRadio() {
    System.out.println(location + " stereo is set for Radio");
  }

  public void setVolume(int volume) {
    // code to set the volume
    // valid range: 1-11 (after all 11 is better than 10, right?)
    System.out.println(location + " stereo volume set to " + volume);
  }
}

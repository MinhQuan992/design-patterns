package org.example.commandpattern.receiver;

import org.example.commandpattern.Location;

public class Light {
  private final Location location;

  public Light(Location location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + " light is on");
  }

  public void off() {
    System.out.println(location + " light is off");
  }
}

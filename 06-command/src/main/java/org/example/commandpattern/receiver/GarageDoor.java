package org.example.commandpattern.receiver;

import org.example.commandpattern.Location;

public class GarageDoor {
  private final Location location;

  public GarageDoor(Location location) {
    this.location = location;
  }

  public void up() {
    System.out.println(location + " garage door is Open");
  }

  public void down() {
    System.out.println(location + " garage door is Closed");
  }
}

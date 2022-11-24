package org.example.commandpattern;

public enum Location {
  LIVING_ROOM("Living Room"),
  KITCHEN("Kitchen"),
  GARAGE("Garage");

  private final String location;

  Location(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return location;
  }
}

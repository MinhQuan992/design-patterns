package org.example.templatemethod.ducksorttest;

public class Duck implements Comparable<Duck> {
  private final String name;
  private final int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return String.format("%s weighs %d", name, weight);
  }

  @Override
  public int compareTo(Duck otherDuck) {
    return Integer.compare(weight, otherDuck.weight);
  }
}

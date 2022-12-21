package org.example.iteratorcomposite.iterator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MenuItem {
  private final String name;
  private final String description;
  private final boolean vegetarian;
  private final double price;

  @Override
  public String toString() {
    return String.format("%s, $%.2f\n\t%s", name, price, description);
  }
}

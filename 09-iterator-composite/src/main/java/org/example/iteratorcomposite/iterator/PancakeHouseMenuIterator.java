package org.example.iteratorcomposite.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
  private final List<MenuItem> items;
  private int position;

  public PancakeHouseMenuIterator(List<MenuItem> items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return position < items.size();
  }

  @Override
  public MenuItem next() {
    return items.get(position++);
  }
}

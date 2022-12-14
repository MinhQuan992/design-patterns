package org.example.iteratorcomposite.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  private final MenuItem[] items;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  @Override
  public MenuItem next() {
    return items[position++];
  }
}

package org.example.iteratorcomposite.iterator;

import java.util.Iterator;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Waitress {
  private final List<Menu> menus;

  public void printMenu() {
    for (Menu menu : menus) {
      printMenu(menu.createIterator());
    }
  }

  public void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

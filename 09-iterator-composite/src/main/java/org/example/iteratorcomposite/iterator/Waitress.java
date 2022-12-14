package org.example.iteratorcomposite.iterator;

import java.util.Iterator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Waitress {
  private final Menu pancakeHouseMenu;
  private final Menu dinerMenu;

  public void printMenu() {
    Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();

    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeHouseIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerMenuIterator);
  }

  public void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

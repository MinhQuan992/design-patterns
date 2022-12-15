package org.example.iteratorcomposite.iterator;

import java.util.Iterator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Waitress {
  private final Menu pancakeHouseMenu;
  private final Menu dinerMenu;
  private final Menu cafeMenu;

  public void printMenu() {
    Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
    Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeHouseIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerMenuIterator);
    System.out.println("\nDINNER");
    printMenu(cafeMenuIterator);
  }

  public void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

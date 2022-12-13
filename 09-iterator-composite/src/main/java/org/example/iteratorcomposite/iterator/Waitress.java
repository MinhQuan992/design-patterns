package org.example.iteratorcomposite.iterator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Waitress {
  private final PancakeHouseMenu pancakeHouseMenu;
  private final DinerMenu dinerMenu;

  public void printMenu() {
    Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
    Iterator dinerMenuIterator = dinerMenu.createIterator();

    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeHouseIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerMenuIterator);
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

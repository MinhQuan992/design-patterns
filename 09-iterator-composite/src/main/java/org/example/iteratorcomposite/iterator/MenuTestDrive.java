package org.example.iteratorcomposite.iterator;

import java.util.List;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    List<Menu> menus = List.of(pancakeHouseMenu, dinerMenu, cafeMenu);
    Waitress waitress = new Waitress(menus);

    waitress.printMenu();
  }
}

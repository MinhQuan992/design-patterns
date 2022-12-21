package org.example.iteratorcomposite.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
  private final List<MenuComponent> menuComponents = new ArrayList<>();
  private final String name;
  private final String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("---------------------");

    for (MenuComponent menuComponent : menuComponents) {
      menuComponent.print();
    }
  }
}

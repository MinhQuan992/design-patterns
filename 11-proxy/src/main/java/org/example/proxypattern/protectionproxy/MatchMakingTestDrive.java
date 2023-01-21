package org.example.proxypattern.protectionproxy;

import java.util.HashMap;
import java.util.Map;
import org.example.proxypattern.protectionproxy.proxy.PersonProxy;
import org.example.proxypattern.protectionproxy.subject.Person;
import org.example.proxypattern.protectionproxy.subject.PersonImpl;

public class MatchMakingTestDrive {
  private static final Map<String, Person> datingDB = new HashMap<>();

  public static void main(String[] args) {
    initializeDatabase();

    Person joe = getPersonFromDatabase("Joe Javabean");
    Person ownerProxy = PersonProxy.getOwnerProxy(joe);
    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("bowling, Go");
    System.out.println("Interests set from owner proxy");
    try {
      ownerProxy.setGeekRating(10);
    } catch (Exception ex) {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is " + ownerProxy.getGeekRating());

    System.out.println();

    Person nonOwnerProxy = PersonProxy.getNonOwnerProxy(joe);
    System.out.println("Name is " + nonOwnerProxy.getName());
    try {
      nonOwnerProxy.setInterests("bowling, Go");
    } catch (Exception ex) {
      System.out.println("Can't set interests from non owner proxy");
    }
    nonOwnerProxy.setGeekRating(3);
    System.out.println("Rating set from non owner proxy");
    System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
  }

  private static void initializeDatabase() {
    Person joe = new PersonImpl();
    joe.setName("Joe Javabean");
    joe.setInterests("cars, computers, music");
    joe.setGeekRating(7);
    datingDB.put(joe.getName(), joe);

    Person kelly = new PersonImpl();
    kelly.setName("Kelly Klosure");
    kelly.setInterests("ebay, movies, music");
    kelly.setGeekRating(6);
    datingDB.put(kelly.getName(), kelly);
  }

  private static Person getPersonFromDatabase(String name) {
    return datingDB.get(name);
  }
}

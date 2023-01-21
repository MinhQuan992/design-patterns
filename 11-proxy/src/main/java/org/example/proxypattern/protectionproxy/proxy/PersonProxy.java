package org.example.proxypattern.protectionproxy.proxy;

import java.lang.reflect.Proxy;
import org.example.proxypattern.protectionproxy.handler.NonOwnerInvocationHandler;
import org.example.proxypattern.protectionproxy.handler.OwnerInvocationHandler;
import org.example.proxypattern.protectionproxy.subject.Person;

public class PersonProxy {
  public static Person getOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new OwnerInvocationHandler(person));
  }

  public static Person getNonOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new NonOwnerInvocationHandler(person));
  }
}

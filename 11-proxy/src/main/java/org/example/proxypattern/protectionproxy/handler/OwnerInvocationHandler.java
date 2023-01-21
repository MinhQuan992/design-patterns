package org.example.proxypattern.protectionproxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.example.proxypattern.protectionproxy.subject.Person;

public class OwnerInvocationHandler implements InvocationHandler {
  private final Person person;

  public OwnerInvocationHandler(Person person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      if (method.getName().equals("setGeekRating")) {
        throw new IllegalAccessException();
      }
      if (method.getName().startsWith("get") || method.getName().startsWith("set")) {
        return method.invoke(person, args);
      }
    } catch (InvocationTargetException ex) {
      ex.printStackTrace();
    }
    return null;
  }
}

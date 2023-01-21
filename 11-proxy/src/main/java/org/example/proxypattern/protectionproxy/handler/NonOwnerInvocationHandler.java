package org.example.proxypattern.protectionproxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.example.proxypattern.protectionproxy.subject.Person;

public class NonOwnerInvocationHandler implements InvocationHandler {
  private final Person person;

  public NonOwnerInvocationHandler(Person person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      if (method.getName().startsWith("get") || method.getName().equals("setGeekRating")) {
        return method.invoke(person, args);
      }
      if (method.getName().startsWith("set")) {
        throw new IllegalAccessException();
      }
    } catch (InvocationTargetException ex) {
      ex.printStackTrace();
    }
    return null;
  }
}

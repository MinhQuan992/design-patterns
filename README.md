# STUDY COMMON DESIGN PATTERNS

## 1. About this project
This project contains many sample codes for demonstrating the usage of the following design patterns:

- [x] [The Strategy Pattern](./01-strategy/README.md): Encapsulates interchangeable behaviors and uses delegation to decide which one to use.
- [x] [The Observer Pattern](./02-observer/README.md): Allows objects to be notified when state changes.
- [x] [The Decorator Pattern](./03-decorator/README.md): Wraps an object to provide new behavior.
- [x] [The Factory Pattern](./04-factory/README.md):
  - Factory Method: Subclasses decide which concrete classes to create.
  - Abstract Factory: Allows a client to create families of objects without specifying their concrete classes.
- [x] [The Singleton Pattern](./05-singleton/README.md): Ensures one and only object is created.
- [x] [The Command Pattern](./06-command/README.md): Encapsulates a request as an object.
- [x] [The Adapter and Facade Patterns](./07-adapter-facade/README.md):
  - Adapter: Wraps an object and provides a different interface to it.
  - Facade: Simplifies the interface of a set of classes.
- [x] [The Template Method Pattern](./08-template-method/README.md): Subclasses decide how to implement steps in an algorithm.
- [x] [The Iterator and Composite Patterns](./09-iterator-composite/README.md):
  - Iterator: Provides a way to traverse a collection of objects without exposing its implementation.
  - Composite: Clients treat collections of objects and individual objects uniformly.
- [x] [The State Pattern](./10-state/README.md): Encapsulates state-based behaviors and uses delegation to switch between behaviors.
- [x] [The Proxy Pattern](./11-proxy/README.md): Wraps an object to control access to it.
- [x] [The Compound Pattern](./12-compound/README.md): Combines two or more patterns into a solution that solves a recurring or general problem.

## 2. Reference
- The problem in each module is from the book [Head First Design Patterns, 2nd Edition](https://www.oreilly.com/library/view/head-first-design/9781492077992/) by Eric Freeman and Elisabeth Robson.
- The code, definitions, principles, and some diagrams in this project are referenced from that book.

## 3. Object-Oriented (OO) Design Principles
- Encapsulate what varies.
- Favor composition over inheritance.
- Program to interfaces, not implementations.
- Strive for loosely coupled designs between objects that interact.
- Classes should be open for extension but closed for modification.
- Depend upon abstractions. Do not depend upon concrete classes.
- Principle of Least Knowledge: talk only to your immediate friends (see demonstrations [here](./07-adapter-facade/README.md) for more details).
- The Hollywood Principle: don't call us, we'll call you (see demonstrations [here](./08-template-method/README.md) for more details).
- The Single Responsibility Principle: a class should have only one reason to change.

## 4. Pattern Categories
- **Creational patterns** involve object instantiation and all provide a way to decouple a client from the objects it needs to instantiate:
  - Factory Method Pattern
  - Abstract Factory Pattern
  - Singleton Pattern
- Any pattern that is a **Behavioral Pattern** is concerned with how classes and objects interact and distribute responsibility:
  - Strategy Pattern
  - Observer Pattern
  - Command Pattern
  - Template Method Pattern
  - Iterator Pattern
  - State Pattern
- **Structural patterns** let you compose classes or objects into larger structures:
  - Decorator Pattern
  - Adapter Pattern
  - Facade Pattern
  - Composite Pattern
  - Proxy Pattern

# Factory_Pattern

Factory Pattern Demo in Java
This repository contains a demo implementation of the Factory Design Pattern in Java.
The Factory Pattern is a creational design pattern that provides an interface for creating objects
in a super class, but allows subclasses to alter the type of objects that will be created. It
promotes loose coupling and enhances scalability by enabling flexibility in object creation.

Overview
In this demo, I have implemented a factory class that abstracts the instantiation logic for
different types of objects. This pattern is particularly useful when the exact type of object to be
created is determined at runtime, and it allows for greater maintainability and readability in
complex systems.

**Key Concepts:**
`Factory Class`: Responsible for creating objects without exposing the instantiation logic to the
client.
`Product Interface`: Defines the common interface for objects created by the factory.
`Concrete Products`: Specific implementations of the product interface created by the factory.

**Benefits of Using Factory Pattern:**

`Encapsulation of Object Creation`: Reduces the complexity of client-side code by hiding the
instantiation logic.
`Loose Coupling`: Clients are not aware of the concrete classes they interact with, promoting better
flexibility and maintenance.
`Scalability`: The pattern allows for adding new product types with minimal changes to existing
code.
Structure

`Product Interface`: Defines the contract for the products to be created.
`ConcreteProductA and ConcreteProductB`: Implementations of the Product interface.
`Factory Class`: Contains the logic for instantiating and returning product objects based on input
criteria.
`Main Class`: Demonstrates the usage of the factory pattern by creating various product objects
dynamically.
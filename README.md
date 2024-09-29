**Factory Pattern Demo in Java**

This repository contains a demo implementation of the Factory Design Pattern in Java.

The Factory Pattern is a creational design pattern that provides an interface for creating objects
in a superclass but allows subclasses to alter the type of objects created.

It promotes loose coupling and enhances scalability by enabling flexibility in object creation.

**Overview**

In this demo, I have implemented a factory class that abstracts the instantiation logic for
different types of objects.

This pattern is particularly useful when the exact type of object to be created is determined at
runtime, allowing for greater maintainability and readability in complex systems.

**Factory Pattern Demo in Java (Real-World Scenario)**

This repository demonstrates the Factory Design Pattern in Java, using a real-world scenario where
different database services (TiDB, MongoDB, Neo4j) are selected based on a user-specified
identifier.

The Factory Pattern abstracts object creation, promoting loose coupling and easier
maintainability.

**Overview**

`QueryService Interface`: Defines the getData() method to retrieve data from a database.

`Concrete Services`: TIDBService, MONGOService, and NEO4JService implement the QueryService
 interface and handle specific database operations.

`DatabaseFactory`: Returns the appropriate QueryService instance based on the database type.

`ProcessFactory`: Retrieves the correct service instance from DatabaseFactory and invokes its
 getData() method.
Here’s a **README.md** file for your GitHub repository named **University-Record-System**, along with a short description of what the code does:

***

## README.md

````markdown
# University-Record-System

A simple Java-based university record system that demonstrates the use of **collections**, **generics**, and **object-oriented programming** principles. This project models a basic academic structure involving **students**, **lecturers**, and **modules**, and allows for tracking which modules are taught and taken by whom.

## Features

- Abstract `Person` class with shared properties (`idNumber`, `name`)
- `Lecturer` class that can teach and drop modules
- `Student` class that can take and drop modules
- `Module` class that tracks enrolled students and assigned lecturer
- Uses `ArrayList` to manage relationships between entities
- Demonstrates one-to-many and many-to-many relationships

## Entities

- **Person** (abstract): Base class for `Student` and `Lecturer`
- **Lecturer**: Can teach multiple modules
- **Student**: Can take multiple modules
- **Module**: Can be taught by one lecturer and taken by many students

## Example Data

Includes sample data for:
- 9 students with unique IDs and names
- 6 modules with titles
- Students enrolled in various modules

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/JoshuaR132/University-Record-System.git
````

2.  Compile the Java files:
    ```bash
    javac *.java
    ```
3.  Run the main class:
    ```bash
    java UniversityRecordSystem
    ```

## Structure

    University-Record-System/
    │
    ├── Person.java
    ├── Lecturer.java
    ├── Student.java
    ├── Module.java
    └── UniversitySystem.java

## Learning Objectives

*   Practice using Java collections (`ArrayList`)
*   Understand inheritance and abstraction
*   Model real-world relationships in code
*   Gain experience with generics and encapsulation

## Requirements

*   Java 8 or higher
*   Any IDE or command-line compiler
```

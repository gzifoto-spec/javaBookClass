# Book Management System

A simple Java application for managing book information.

<img width="600" alt="Screenshot From 2026-02-16 17-01-08" src="https://github.com/user-attachments/assets/f708bc3b-31d9-4c31-880f-8857d5103008" />

## Features

- Book registration with complete information (title, author, synopsis, ISBN, price)
- Object-oriented design with encapsulation
- Getters and setters for all book properties

## Project Structure
```
src/
└── main/
    └── java/
        └── org/
            └── example/
                ├── MainBook.java
                └── book/
                    └── Book.java
```

## Book Properties

- **Title**: Book title
- **Author**: Author name  
- **Synopsis**: Brief description
- **ISBN**: International Standard Book Number
- **Price**: Book price

## Usage
```java
Book book1 = new Book("Ciberiada",
                      "Stanislaw Lem",
                      "Fabulas de robots para no robots",
                      "978-84-9104-173-3",
                      13.95f);

System.out.println(book1.overview());
```

## Output
```
Ciberiada por Lem, Stanislaw: Fábulas de robots para no robots
```

## Requirements

- Java 17 or higher
- No external dependencies

## How to Run
```bash
javac src/main/java/org/example/MainBook.java src/main/java/org/example/book/Book.java
java -cp src/main/java org.example.MainBook
```

## License

GPLv3

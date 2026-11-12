# SC-Lab-7: Construction for Reuse - Interfaces, Generics, and Contracts

**Course:** Software Construction (Fall 2026), UET Abbottabad Campus
**Instructor:** Engr. Rizwan Shah
**Author:** Hanif Ullah

This lab applies black-box reuse, generic type safety and contract integrity (Liskov Substitution Principle) in Java.

## Project structure

```
src/
├── task1/                 Lab Task 1 - Composition via interfaces
│   ├── PaymentMethod.java
│   ├── CreditCardPayment.java
│   ├── JazzCashPayment.java
│   ├── EcommerceCart.java
│   └── Main.java
├── task2/                 Lab Task 2 - Generic DataBox<T>
│   ├── DataBox.java
│   └── Main.java
├── task3/                 Lab Task 3 - Liskov Substitution Principle
│   ├── flawed/            Rectangle, Square (extends Rectangle), FlawedClient
│   └── fixed/             Shape, Rectangle, Square, FixedClient
└── task4/                 Lab Task 4 (homework) - Comparable vs Comparator
    ├── Student.java
    ├── CgpaComparator.java
    └── Main.java
```

## Task descriptions

### Lab Task 1 - Black-Box Reuse (Composition via Interfaces)
`PaymentMethod` is an interface with `boolean pay(double amount)`. `CreditCardPayment` and
`JazzCashPayment` implement it. `EcommerceCart` receives a `PaymentMethod` through its constructor
(dependency injection), so it can check out with any payment type without knowing which one it is.
The cart never mentions the two concrete classes.

### Lab Task 2 - Generic DataBox
`DataBox<T>` has a private field of type `T`, a constructor and a getter. `Main` creates a
`DataBox<String>` (student name) and a `DataBox<Integer>` (student ID). Storing a String in the
`DataBox<Integer>` is a compile-time error (see the commented lines in `task2/Main.java`).

### Lab Task 3 - Liskov Substitution Principle
`task3/flawed`: `Square extends Rectangle` and throws an exception when `w != h`. A client that treats a
`Square` as a `Rectangle` and calls `setDimensions(5, 10)` crashes.
`task3/fixed`: the inheritance chain is broken. `Rectangle` and `Square` both implement a common
`Shape` interface, so no client can substitute one for the other incorrectly.

### Lab Task 4 (Homework) - Reusable Ordering Algorithms
`Student` (`rollNo`, `cgpa`) implements `Comparable<Student>` so it naturally sorts by `rollNo` ascending.
`CgpaComparator implements Comparator<Student>` sorts by `cgpa` descending. `Main` sorts three students
both ways.

## How to run

### In NetBeans
1. File -> Open Project -> select the `SC-Lab-7` folder.
2. In the Projects panel, right-click any of these files and choose **Run File**:
   `task1/Main.java`, `task2/Main.java`, `task3/flawed/FlawedClient.java`,
   `task3/fixed/FixedClient.java`, `task4/Main.java`.

### From the command line (JDK 17 or newer)
```
javac -d out src/task1/*.java src/task2/*.java src/task3/flawed/*.java src/task3/fixed/*.java src/task4/*.java
java -cp out task1.Main
java -cp out task2.Main
java -cp out task3.flawed.FlawedClient
java -cp out task3.fixed.FixedClient
java -cp out task4.Main
```

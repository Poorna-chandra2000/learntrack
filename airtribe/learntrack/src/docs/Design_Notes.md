## Project Name: LearnTrack – Student & Course Management System

This is a Java console application used to manage students, courses, and enrollments. The goal of this project is to understand OOP concepts, Collections, static members, package structuring, and basic exception handling while keeping the code simple and readable.

---

## 1. Why I used ArrayList instead of Array

I chose `ArrayList` to store Students, Courses, and Enrollments because:

* Arrays have a fixed size, but ArrayList grows automatically as new data is added.
* ArrayList provides built-in methods like `add()`, `remove()`, `get()`, and `size()` which makes operations easier.
* Since this project is based on adding and searching items frequently, ArrayList is more flexible and manageable than arrays.

In short, ArrayList helped to handle collection data dynamically and cleanly.

---

## 2. Use of Static Members and Why

I created an `IdGenerator` utility class where ID counters are declared as static variables and accessed using static methods.

Example:

```
private static int studentId;
private static int courseId;
private static int enrollmentId;
public static int getNextStudentId() { ... }
```

Reason for using static:

* ID counters must be common across the entire application, not separate per object.
* Static ensures there is only one shared value in memory for generating unique IDs.
* It allows calling methods without creating an object like:
  `IdGenerator.getNextStudentId()`.

Static made ID generation simple, centralized, and consistent.

---

## 3. Where I Used Inheritance and What Benefit I Got

A base class `Person` was created with fields such as `id`, `firstName`, `lastName`, and `email`.
Then `Student` extends `Person`.

Benefits gained:

* Avoided repeating common fields and logic in multiple classes.
* Reusability was improved since `Student` automatically inherited those fields.
* Project is easier to scale. For example, adding `Trainer` in the future becomes simple.
* Demonstrates polymorphism using method overriding. Student overrides `getDisplayName()` with a customized output.

Inheritance helped keep the code structured and reduced duplication.

---

## 4. Package Structure and Reason Behind It

The project is divided into multiple packages to maintain clarity and separation of responsibility.

| Package         | Purpose                                                     |
| --------------- | ----------------------------------------------------------- |
| entity          | Contains model classes like Student, Course, Enrollment     |
| service         | Contains business logic (add, list, search, enroll methods) |
| util            | Contains IdGenerator for unique ID generation               |
| exception       | Contains custom exception handling                          |
| enums           | Contains enrollment status values                           |
| constants       | Stores application constant values                          |
| root(Main.java) | Handles menu and user input only                            |

This structure makes the project easy to maintain and understand.

---

## 5. Clean Code Choices

* Used meaningful method names, for example: `addStudent`, `findCourseById`, `listCourses`.
* Main class is only for user input and menu interaction. Logic is inside service classes.
* Classes are short and perform one responsibility.
* Used custom exception `EntityNotFoundException` to handle invalid lookups instead of crashing.

---

## 6. Possible Future Improvements

This project can be extended further by adding:

* Data storage using a file or database
* Update and delete operations for student and course
* Display student-course relationships clearly
* A more detailed user interface

---

## Conclusion

This project helped me understand and implement:

* Encapsulation using private fields and getters/setters
* Inheritance and method overriding through Person and Student classes
* Static members for ID generation
* ArrayList for flexible data storage
* Menu-driven program structure
* Custom exception handling
* Package structuring and clean coding practices

---

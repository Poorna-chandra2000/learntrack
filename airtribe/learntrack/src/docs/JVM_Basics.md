# JVM Basics

## What is JDK, JRE, and JVM?

**JDK (Java Development Kit)**  
JDK is used for developing Java programs. It contains tools like the compiler (`javac`), debugger, and other utilities needed to write and build Java applications.

**JRE (Java Runtime Environment)**  
JRE is used to run Java programs. It includes the JVM and required libraries but does not contain development tools like the compiler.

**JVM (Java Virtual Machine)**  
JVM is the engine that actually runs Java programs. It converts Java bytecode into machine-specific instructions so the program can run on any operating system.

---

## What is Bytecode?

When we compile a Java program, it does not directly convert into machine code.  
Instead, it converts into an intermediate format called **bytecode**.

This bytecode is stored in `.class` files and is understood by the JVM.  
The JVM then converts this bytecode into machine code at runtime.

---

## What does “Write Once, Run Anywhere” mean?

Java follows the principle of **Write Once, Run Anywhere**.  
This means that once a Java program is compiled into bytecode, it can run on any operating system without changing the code.

As long as the system has a compatible JVM installed, the same `.class` file can run on Windows, Linux, or macOS.  
This makes Java platform-independent and very useful for building portable applications.
````

---
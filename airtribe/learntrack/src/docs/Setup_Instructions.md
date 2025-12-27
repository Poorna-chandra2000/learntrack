# Java Environment Setup

## JDK Installation

I installed **Java Development Kit (JDK) version 17** on my system.

Steps I followed:
1. Downloaded JDK 17 from the official Oracle / OpenJDK website.
2. Installed it using the installer.
3. Set the `JAVA_HOME` environment variable.
4. Added Java to the system `PATH`.

To verify the installation, I ran the following command in the terminal:

```

java -version

````

It displayed the installed JDK version correctly, which confirmed that Java was installed successfully.

---

## Hello World Program

I created a simple Hello World program to test Java.

### Code:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
````

### Steps to run:

1. Saved the file as `HelloWorld.java`
2. Compiled it using:

   ```
   javac HelloWorld.java
   ```
3. Ran the program using:

   ```
   java HelloWorld
   ```

### Output:

```
Hello World
```

This confirmed that Java is working properly on my system.

````

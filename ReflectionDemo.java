import java.lang.reflect.*;

class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Get the Class object
            Class<?> cls = Class.forName("Person");

            // Print class name
            System.out.println("Class: " + cls.getName());

            // List all fields
            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println("  " + field);
            }

            // List all methods
            System.out.println("\nMethods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println("  " + method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
    }
}

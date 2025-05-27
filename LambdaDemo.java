import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression to print each name
        names.forEach(name -> System.out.println("Hello, " + name + "!"));
    }
}

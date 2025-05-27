import java.util.*;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");

        // Sort using a lambda expression
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted names: " + names);
    }
}

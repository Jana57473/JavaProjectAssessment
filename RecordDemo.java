import java.util.*;
import java.util.stream.Collectors;

public class RecordDemo {

    // Define a record named Person
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 17),
            new Person("Carol", 22)
        );

        // Print all people
        people.forEach(System.out::println);

        // Filter and print adults (age >= 18)
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults:");
        adults.forEach(System.out::println);
    }
}

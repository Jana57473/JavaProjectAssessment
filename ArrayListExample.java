import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter student names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(name);
        }

        System.out.println("Student names entered:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}

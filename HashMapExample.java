import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names and grades (type 'done' to finish):");

        while (true) {
            System.out.print("Student name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Grade (integer): ");
            int grade;
            try {
                grade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade. Please enter an integer.");
                continue;
            }

            studentGrades.put(name, grade);
        }

        System.out.println("\nStudent Grades:");
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }
    }
}

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Using StringBuilder for reversal
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}

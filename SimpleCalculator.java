import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char op = scanner.next().charAt(0);

        double result = 0;
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if(num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
            default: System.out.println("Invalid operation"); return;
        }
        System.out.println("Result: " + result);
    }
}

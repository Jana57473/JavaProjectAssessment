public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 2 * 5;
        int result4 = 20 / (2 * 5);

        System.out.println("Result of 10 + 5 * 2: " + result1); // 5*2=10, 10+10=20
        System.out.println("Result of (10 + 5) * 2: " + result2); // (10+5)=15, 15*2=30
        System.out.println("Result of 20 / 2 * 5: " + result3); // 20/2=10, 10*5=50
        System.out.println("Result of 20 / (2 * 5): " + result4); // 2*5=10, 20/10=2

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("In '10 + 5 * 2', multiplication (*) has higher precedence than addition (+), so 5 * 2 is evaluated first, then added to 10.");
        System.out.println("Parentheses can change the order: '(10 + 5) * 2' forces addition first.");
        System.out.println("Similarly, in '20 / 2 * 5', division and multiplication have the same precedence and are evaluated left to right.");
        System.out.println("Using parentheses as in '20 / (2 * 5)' changes the order of evaluation.");
    }
}

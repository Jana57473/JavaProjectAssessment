public class TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.78;
        // Cast double to int (narrowing casting, explicit)
        int myInt = (int) myDouble;

        // Declare an int variable
        int anotherInt = 42;
        // Cast int to double (widening casting, implicit)
        double anotherDouble = anotherInt;

        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myInt);
        System.out.println("Original int value: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}

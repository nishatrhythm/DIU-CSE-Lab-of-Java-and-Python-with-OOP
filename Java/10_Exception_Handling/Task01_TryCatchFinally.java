import java.util.Scanner;

public class Task01_TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero. (" + e.getMessage() + ")");
        } finally {
            System.out.println("Finally block executed: Cleaning up resources.");
            scanner.close();
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
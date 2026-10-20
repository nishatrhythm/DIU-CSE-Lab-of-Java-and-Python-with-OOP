public class Task02_Operators {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Is Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));

        boolean condition1 = (a > 10);
        boolean condition2 = (b > 5);

        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT: " + (!condition1));

        int x = 10;
        x += 5;
        System.out.println("Compound assignment (x += 5): " + x);

        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator (Max): " + max);
    }
}
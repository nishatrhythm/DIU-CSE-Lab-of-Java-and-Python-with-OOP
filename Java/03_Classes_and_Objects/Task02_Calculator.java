class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0.0;
        }
        return (double) a / b;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class Task02_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(20, 10);
        int difference = calc.subtract(20, 10);
        int product = calc.multiply(20, 10);
        double quotient = calc.divide(20, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Is 20 even? " + calc.isEven(20));
        System.out.println("Is 15 even? " + calc.isEven(15));
    }
}
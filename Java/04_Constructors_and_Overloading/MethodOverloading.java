class AreaCalculator {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(int base, double height) {
        return 0.5 * base * height;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of Circle (r = 5.0): " + calculator.calculateArea(5.0));
        System.out.println("Area of Rectangle (l = 4.0, w = 6.0): " + calculator.calculateArea(4.0, 6.0));
        System.out.println("Area of Triangle (b = 5, h = 8.0): " + calculator.calculateArea(5, 8.0));

        System.out.println("Addition of two ints: " + calculator.add(10, 20));
        System.out.println("Addition of three ints: " + calculator.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 4.5));
    }
}

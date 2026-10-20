class MathUtils {
    static double PI;

    static {
        PI = 3.141592653589793;
        System.out.println("Static block executed: PI initialized.");
    }

    static int square(int number) {
        return number * number;
    }

    static int cube(int number) {
        return number * number * number;
    }

    static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        int sq = MathUtils.square(6);
        int cb = MathUtils.cube(4);
        double area = MathUtils.circleArea(7.0);

        System.out.println("Square of 6: " + sq);
        System.out.println("Cube of 4: " + cb);
        System.out.println("Circle Area (radius 7.0): " + area);
    }
}

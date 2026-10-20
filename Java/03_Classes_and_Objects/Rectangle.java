public class Rectangle {
    double length;
    double width;

    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void displayInfo() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setDimensions(10.5, 4.0);

        Rectangle rect2 = new Rectangle();
        rect2.setDimensions(7.0, 3.5);

        rect1.displayInfo();
        rect2.displayInfo();
    }
}

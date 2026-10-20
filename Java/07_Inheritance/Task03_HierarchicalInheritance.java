class Shape {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

public class Task03_HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(5.0);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("-------------------------");

        Rectangle rect = new Rectangle();
        rect.setColor("Blue");
        rect.setDimensions(8.0, 4.0);
        rect.displayColor();
        System.out.println("Rectangle Area: " + rect.getArea());
    }
}
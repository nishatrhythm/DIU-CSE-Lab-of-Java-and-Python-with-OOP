class Vehicle {
    String brand = "Standard Vehicle";
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void start() {
        System.out.println("Vehicle engine is starting.");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    String brand = "Toyota";
    int numberOfDoors;

    Car(int maxSpeed, int numberOfDoors) {
        super(maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    void start() {
        super.start();
        System.out.println("Car is ready to drive with keyless start.");
    }

    void showBrands() {
        System.out.println("Subclass brand: " + brand);
        System.out.println("Superclass brand: " + super.brand);
    }

    void displayCarInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car(180, 4);
        car.displayCarInfo();
        System.out.println("-------------------------");
        car.showBrands();
        System.out.println("-------------------------");
        car.start();
    }
}

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Calculated Monthly Salary: $" + calculateSalary());
        System.out.println("-------------------------");
    }
}

class FullTimeEmployee extends Employee {
    double basicSalary;
    double bonus;

    FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Employee fullTimer = new FullTimeEmployee("Fahim", 301, 50000.0, 10000.0);
        Employee partTimer = new PartTimeEmployee("Nusrat", 302, 60, 500.0);

        fullTimer.displayDetails();
        partTimer.displayDetails();
    }
}

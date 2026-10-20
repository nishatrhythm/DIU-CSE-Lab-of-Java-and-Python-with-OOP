class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    void setEmployeeDetails(String name, int age, int employeeId, double salary) {
        setPersonDetails(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    void setManagerDetails(String name, int age, int employeeId, double salary, String department) {
        setEmployeeDetails(name, age, employeeId, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setManagerDetails("Mahmud Hasan", 42, 1001, 85000.0, "Software Development");
        mgr.displayManagerDetails();
    }
}

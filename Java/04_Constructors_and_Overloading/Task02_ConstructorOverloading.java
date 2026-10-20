class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        this(0, "Not Assigned", "General", 0.0);
    }

    Employee(int id, String name) {
        this(id, name, "General", 25000.0);
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }
}

public class Task02_ConstructorOverloading {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "David");
        Employee emp3 = new Employee(102, "Sarah", "Engineering", 75000.0);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
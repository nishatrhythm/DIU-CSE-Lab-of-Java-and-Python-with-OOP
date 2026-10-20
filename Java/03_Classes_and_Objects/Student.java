public class Student {
    String name;
    int id;
    String department;
    double cgpa;

    void setDetails(String studentName, int studentId, String dept, double studentCgpa) {
        name = studentName;
        id = studentId;
        department = dept;
        cgpa = studentCgpa;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Alice Johnson", 101, "CSE", 3.85);

        Student student2 = new Student();
        student2.setDetails("Bob Smith", 102, "SWE", 3.70);

        student1.displayDetails();
        student2.displayDetails();
    }
}

class StudentRecord {
    int id;
    String name;
    static String universityName = "Daffodil International University";
    static int totalStudents = 0;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudents++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("University: " + universityName);
        System.out.println("Total Enrolled Students: " + totalStudents);
        System.out.println("-------------------------");
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        System.out.println("Initial student count: " + StudentRecord.totalStudents);

        StudentRecord s1 = new StudentRecord(201, "Karim");
        StudentRecord s2 = new StudentRecord(202, "Fatima");
        StudentRecord s3 = new StudentRecord(203, "Tanvir");

        s1.display();
        s2.display();
        s3.display();

        StudentRecord.universityName = "DIU - Main Campus";
        System.out.println("Updated University name across all instances:");
        s1.display();
    }
}

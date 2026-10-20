class StudentProfile {
    private int id;
    private String name;
    private int marks;

    public StudentProfile(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        setMarks(marks);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID must be positive.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    public String calculateGrade() {
        if (marks >= 80) return "A+";
        if (marks >= 70) return "A";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    public void displayProfile() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }
}

public class Task02_StudentProfile {
    public static void main(String[] args) {
        StudentProfile student = new StudentProfile(501, "Arman Khan", 85);
        student.displayProfile();

        student.setMarks(120);
        student.setMarks(72);
        student.setName("");
        student.setName("Arman Hossain");

        student.displayProfile();
    }
}
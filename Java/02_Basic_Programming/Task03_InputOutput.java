import java.util.Scanner;

public class Task03_InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", cgpa);

        scanner.close();
    }
}
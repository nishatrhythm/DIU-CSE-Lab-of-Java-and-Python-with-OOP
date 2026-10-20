import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "students.txt";
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Reading contents of " + fileName + ":\n");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

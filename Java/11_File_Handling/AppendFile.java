import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) {
        String fileName = "students.txt";
        String newRecord = "104,Tamim,Civil\n";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(newRecord);
            System.out.println("Record appended successfully to: " + fileName);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        System.out.println("\nUpdated File Contents:");
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

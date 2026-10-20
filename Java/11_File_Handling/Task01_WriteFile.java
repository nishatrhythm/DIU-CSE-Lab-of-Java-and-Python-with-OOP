import java.io.FileWriter;
import java.io.IOException;

public class Task01_WriteFile {
    public static void main(String[] args) {
        String fileName = "students.txt";
        String content = "ID,Name,Department\n101,Rahim,CSE\n102,Karim,SWE\n103,Fatima,EEE\n";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
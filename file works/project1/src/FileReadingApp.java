import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingApp {
    public static void main(String[] args) {
        String filePath = "input.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
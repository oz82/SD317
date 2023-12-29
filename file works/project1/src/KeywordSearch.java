import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class KeywordSearch {
    public static void main(String[] args) throws IOException {
        String filePath = "input.txt";
        String keyword = "akademik";

        BufferedReader reader = null;
        ArrayList<String> results = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] tokens = currentLine.split(" ");
                if (Arrays.asList(tokens).contains(keyword)) {
                    results.add(currentLine);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(keyword + ".txt"));
            for (String s : results) {
                writer.write(s + "\n");
            }
            System.out.println("Dosya başarıyla yazıldı.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        writer.close();
    }
}
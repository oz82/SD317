import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingApp {

    public static void main(String[] args) throws IOException {
        String filePath = "output.txt";
        String content = "Bu metin dosyaya yazılacak.";

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            System.out.println("Dosya başarıyla yazıldı.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        writer.close();
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadingApp2 {
    public static void main(String[] args) {

        String dirName = "C:\\Users\\oz\\Desktop\\SD317-main\\file works\\project1";

        File file = new File(dirName);
        File[] fileList = file.listFiles();

        for (File f: fileList) {
            if (f.isFile()) {
                ArrayList<String> list = read(f.getAbsolutePath());
                System.out.println(f.getName() + "\t" + list.size());
            }
        }
    }

    private static ArrayList<String> read(String path) {
        BufferedReader reader = null;
        ArrayList<String> content = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                content.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return content;
    }
}

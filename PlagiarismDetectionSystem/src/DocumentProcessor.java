import java.io.*;
import java.util.*;

public class DocumentProcessor {

    public static List<String> readFile(String filePath) throws IOException {
        List<String> tokens = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    tokens.add(word);
                }
            }
        }
        br.close();
        return tokens;
    }
}
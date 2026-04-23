import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of files:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter path of file " + (i + 1) + ":");
            files[i] = sc.nextLine();
        }

        Map<String, List<String>> documentNGrams = new HashMap<>();

        // Process each file
        for (String file : files) {
            List<String> tokens = DocumentProcessor.readFile(file);
            List<String> ngrams = NGramGenerator.generateNGrams(tokens, n);
            documentNGrams.put(file, ngrams);
        }

        // Compare documents
        for (int i = 0; i < files.length; i++) {
            for (int j = i + 1; j < files.length; j++) {

                double similarity = SimilarityCalculator.calculateSimilarity(
                        documentNGrams.get(files[i]),
                        documentNGrams.get(files[j])
                );

                System.out.println(files[i] + " vs " + files[j] +
                        " --> " + String.format("%.2f", similarity) + "%");
            }
        }
    }
}
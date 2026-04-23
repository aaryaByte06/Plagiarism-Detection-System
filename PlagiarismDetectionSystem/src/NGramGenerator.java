import java.util.*;

public class NGramGenerator {

    public static List<String> generateNGrams(List<String> tokens, int n) {
        List<String> ngrams = new ArrayList<>();

        for (int i = 0; i <= tokens.size() - n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                sb.append(tokens.get(i + j)).append(" ");
            }

            ngrams.add(sb.toString().trim());
        }

        return ngrams;
    }
}
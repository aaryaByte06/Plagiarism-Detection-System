import java.util.*;

public class SimilarityCalculator {

    public static double calculateSimilarity(List<String> ngrams1, List<String> ngrams2) {
        Set<String> set1 = new HashSet<>(ngrams1);
        Set<String> set2 = new HashSet<>(ngrams2);

        int matchCount = 0;

        for (String gram : set1) {
            if (set2.contains(gram)) {
                matchCount++;
            }
        }

        int total = set1.size() + set2.size();

        return (2.0 * matchCount / total) * 100;
    }
}
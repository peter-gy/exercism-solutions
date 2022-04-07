import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Anagram {

    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> words) {
        return words.stream()
                .filter(w -> isAnagram(word, w))
                .collect(Collectors.toList());
    }

    private static boolean isAnagram(String word1, String word2) {
        return  !word1.equalsIgnoreCase(word2) &&
                Arrays.equals(
                word1.toLowerCase().chars().sorted().toArray(),
                word2.toLowerCase().chars().sorted().toArray());
    }
}
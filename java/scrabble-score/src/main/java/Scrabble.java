import java.util.Map;

class Scrabble {

    private final static Map<String, Integer> letterValueMap = Map.ofEntries(
            Map.entry("AEIOULNRST", 1),
            Map.entry("DG", 2),
            Map.entry("BCMP", 3),
            Map.entry("FHVWY", 4),
            Map.entry("K", 5),
            Map.entry("JX", 8),
            Map.entry("QZ", 10)
    );
    private final int score;

    Scrabble(String word) {
        score = word.chars().map(i -> valueOfLetter((char) i)).sum();
    }

    private int valueOfLetter(Character letter) {
        return letterValueMap.keySet().stream()
                .filter(s -> s.contains(String.valueOf(letter).toUpperCase()))
                .findFirst()
                .map(letterValueMap::get)
                .orElseThrow(IllegalArgumentException::new);
    }

    int getScore() {
        return score;
    }

}

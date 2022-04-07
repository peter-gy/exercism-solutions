import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class PigLatinTranslator {

    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public String translate(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .map(this::translateWord)
                .collect(Collectors.joining(" "));
    }

    private String translateWord(String word) {
        final String lowerCaseWord = word.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(lowerCaseWord);

        boolean wordStartsWithVowel = vowels.contains(lowerCaseWord.charAt(0));
        boolean wordStartsWithVowelSound = lowerCaseWord.startsWith("xr") || lowerCaseWord.startsWith("yt");
        if (wordStartsWithVowel || wordStartsWithVowelSound) {
            stringBuilder.append("ay");
            return stringBuilder.toString();
        }

        String consonantCluster = getConsonantCluster(lowerCaseWord);
        if (!consonantCluster.isEmpty()) {
            stringBuilder.delete(0, consonantCluster.length())
                    .append(consonantCluster)
                    .append("ay");
        }

        return stringBuilder.toString();
    }

    private String getConsonantCluster(String word) {
        String consonantCluster = "";
        for (char character : word.toCharArray()) {
            boolean isConsonant = !vowels.contains(character) && !(character == 'y' && !consonantCluster.isEmpty());
            boolean rule3Case = character == 'u' && consonantCluster.endsWith("q");
            if (isConsonant || rule3Case) consonantCluster += character;
            else break;
        }
        return consonantCluster;
    }

}
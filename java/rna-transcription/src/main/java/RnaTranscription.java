import java.util.Map;
import java.util.stream.Collectors;

class RnaTranscription {

    private static final Map<Character, Character> translationMap = Map.ofEntries(
            Map.entry('G', 'C'),
            Map.entry('C', 'G'),
            Map.entry('T', 'A'),
            Map.entry('A', 'U')
    );

    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(i -> String.valueOf(translationMap.get((char) i)))
                .collect(Collectors.joining(""));
    }

}

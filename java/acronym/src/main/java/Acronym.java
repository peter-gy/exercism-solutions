import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        acronym = Arrays.stream(phrase.split("\\W"))
                .filter(not(String::isEmpty))
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase())
                .collect(Collectors.joining(""));
    }

    String get() {
        return acronym;
    }

}


public class PangramChecker {

    private static final int LETTERS_IN_ALPHABET = 26;

    public boolean isPangram(String input) {
        return input.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == LETTERS_IN_ALPHABET;
    }

}

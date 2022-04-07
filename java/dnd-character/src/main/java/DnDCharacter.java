import java.util.Random;


class DnDCharacter {

    private final static Random RANDOM = new Random();
    private final static int DICE_SIDES = 6;
    private final static int NUMBER_OF_DICE = 4;
    private final static int INITIAL_HIT_POINTS = 10;

    private final int strength = ability();
    private final int dexterity = ability();
    private final int constitution = ability();
    private final int intelligence = ability();
    private final int wisdom = ability();
    private final int charisma = ability();

    int ability() {
        return getRandomIntInRange(3, DICE_SIDES * (NUMBER_OF_DICE - 1) + 1);
    }

    private int getRandomIntInRange(int lowerInclusive, int upperExclusive) {
        return RANDOM.nextInt(upperExclusive - lowerInclusive) + lowerInclusive;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return INITIAL_HIT_POINTS + modifier(constitution);
    }

}

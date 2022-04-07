
class IsogramChecker {

    boolean isIsogram(String phrase) {
        final String temp = phrase.toLowerCase().replace("-", "").replace(" ", "");
        return temp.chars().distinct().count() == temp.length();
    }

}

import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {

    private static final List<String> colorList = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    int value(String[] colors) {
        return 10 * colorList.indexOf(colors[0]) + colorList.indexOf(colors[1]);
    }
}

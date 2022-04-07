import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        // reverse the binary string to make the array indices equal the exponents of 2 in the binary number
        int[] binaryDigits = new StringBuilder(Integer.toBinaryString(number))
                .reverse()
                .toString()
                .chars()
                .map(i -> Integer.parseInt("" + (char) i))
                .toArray();

        // ignore the last binary digit in the iteration if it exists, as it is only a flag for reversing
        boolean needToReverse = binaryDigits.length == Signal.values().length + 1;
        int length = needToReverse ? Signal.values().length : binaryDigits.length;

        List<Signal> signals = new ArrayList<>();
        IntStream.range(0, length).forEach(i -> { if (binaryDigits[i] == 1) signals.add(Signal.values()[i]); });
        if (needToReverse) Collections.reverse(signals);
        return signals;
    }

}

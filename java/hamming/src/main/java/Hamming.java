import java.util.stream.IntStream;

public class Hamming {

    private final String leftStrand;
    private final String rightStrand;
    private final int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");

        if (rightStrand.isEmpty() && !leftStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");

        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        this.hammingDistance = calculateHammingDistance(leftStrand, rightStrand);
    }

    public int getHammingDistance() {
        return hammingDistance;
    }

    private static int calculateHammingDistance(String leftStrand, String rightStrand) {
        return IntStream.range(0, leftStrand.length())
                .map(i -> leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0)
                .sum();
    }
}

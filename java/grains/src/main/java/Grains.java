import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (!(1 <= square && square <= 64)) throw new IllegalArgumentException("square must be between 1 and 64");
        return new BigInteger("0").setBit(square - 1);
    }

    BigInteger grainsOnBoard() {
        return new BigInteger("0").setBit(64).subtract(new BigInteger("1"));
    }

}

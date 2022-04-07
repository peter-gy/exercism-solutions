class RaindropConverter {

    private final static String FACTOR_OF_3_MSG = "Pling";
    private final static String FACTOR_OF_5_MSG = "Plang";
    private final static String FACTOR_OF_7_MSG = "Plong";

    String convert(int number) {
        String result = "";
        if (number % 3 == 0) result += FACTOR_OF_3_MSG;
        if (number % 5 == 0) result += FACTOR_OF_5_MSG;
        if (number % 7 == 0) result += FACTOR_OF_7_MSG;
        return result.isEmpty() ? String.valueOf(number) : result;
    }

}

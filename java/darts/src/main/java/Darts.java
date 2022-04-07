import java.util.Map;

class Darts {

    private static final Map<Double, Integer> pointMap = Map.ofEntries(
            Map.entry(10.0, 1), // outer circle
            Map.entry(5.0, 5), // middle circle
            Map.entry(1.0, 10) // inner circle
    );

    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        return pointMap.keySet().stream()
                .sorted()
                .filter(this::coordinatesAreInsideCircle)
                .findFirst()
                .map(pointMap::get)
                .orElse(0);
    }

    private boolean coordinatesAreInsideCircle(double radius) {
        // using the equation of a circle: x^2 + x^2 = r^2
        boolean xCoordinateIsInsideCircle = x * x <= (radius * radius - y * y);
        boolean yCoordinateIsInsideCircle = y * y <= (radius * radius - x * x);
        return xCoordinateIsInsideCircle && yCoordinateIsInsideCircle;
    }

}

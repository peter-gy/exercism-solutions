import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private final static long SECONDS_TO_ADD = 1_000_000_000;
    private final LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atStartOfDay().plusSeconds(SECONDS_TO_ADD);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(SECONDS_TO_ADD);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}

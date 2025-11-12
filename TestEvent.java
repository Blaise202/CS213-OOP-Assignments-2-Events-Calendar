import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestEvent {

    @Test
    public void testConcertEventCreation() {
        String[] performers = {"Artist A", "Artist B"};
        ConcertEvent concert = new ConcertEvent(
            "Music Night",
            "Auditorium",
            LocalDate.of(2025, 11, 25),
            LocalTime.of(19, 0),
            "2 hours",
            performers
        );

        // Assertions to check data
        assertEquals("Music Night", concert.getName());
        assertEquals("Auditorium", concert.getLocation());
        assertEquals("Artist A", concert.getPerformers()[0]);
        assertEquals("Artist B", concert.getPerformers()[1]);
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestSportsEvent {
    @Test
    public void testSportsGetters() {
        String[] teams = {"A","B"};
        SportsEvent s = new SportsEvent("S", "Loc", LocalDate.of(2025,12,5), LocalTime.of(14,0), "90", teams, "detail");
        assertArrayEquals(teams, s.getTeams());
        assertEquals("detail", s.getDetails());
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestPartyEvent {
    @Test
    public void testPartyGetters() {
        PartyEvent p = new PartyEvent("P", "L", LocalDate.of(2025,12,1), LocalTime.of(20,0), "4h", "Theme", "Dress");
        assertEquals("Theme", p.getTheme());
        assertEquals("Dress", p.getDressCode());
    }
}

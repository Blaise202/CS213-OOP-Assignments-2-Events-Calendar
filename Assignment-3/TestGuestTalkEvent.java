import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestGuestTalkEvent {
    @Test
    public void testGuestTalkGetters() {
        GuestTalkEvent g = new GuestTalkEvent("T", "Loc", LocalDate.of(2025,11,20), LocalTime.of(10,0),
                "1h", "Speaker", "Abstract");
        assertEquals("Speaker", g.getSpeaker());
        assertEquals("Abstract", g.getAbstractText());
    }
}

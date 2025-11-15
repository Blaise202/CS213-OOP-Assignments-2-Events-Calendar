import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestRelationship {

    @Test
    public void testConcertEventRelationship() {
      ConcertEvent c = new ConcertEvent(
        "Music Night", "Auditorium",
        LocalDate.of(2024, 11, 1),
        LocalTime.of(18, 0),
        "2 hours",
        new String[]{"Artist A", "Artist B"}
      );

      assertTrue(c instanceof Performable);
    }

    @Test
    public void testGuestTalkEventRelationship() {
      GuestTalkEvent g = new GuestTalkEvent(
        "AI Talk", "Engineering Block",
        LocalDate.of(2024, 10, 12),
        LocalTime.of(14, 0),
        "1 hour",
        "Dr. Mensah", "Future of AI in Africa"
      );

      assertTrue(g instanceof Talkable);
    }

    @Test
    public void testPartyEventRelationship() {
      PartyEvent p = new PartyEvent(
        "Freshers Party", "Courtyard",
        LocalDate.of(2024, 9, 25),
        LocalTime.of(19, 0),
        "3 hours",
        "Hawaiian Theme",
        "White"
      );

      assertTrue(p instanceof Themeable);
    }

    @Test
    public void testSportsEventRelationship() {
      SportsEvent s = new SportsEvent(
        "Football Finals", "Main Field",
        LocalDate.of(2024, 8, 14),
        LocalTime.of(16, 0),
        "90 minutes",
        new String[]{"Team A", "Team B"},
        "Season final"
      );

      assertTrue(s instanceof TeamBased);
    }
}



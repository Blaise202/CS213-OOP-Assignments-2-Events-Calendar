import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestEvent {

  @Test
  public void testConcertCreationAndGetters() {
    String[] performers = {"Blacko", "Kofi"};
    ConcertEvent c = new ConcertEvent("M", "L", LocalDate.of(2025,11,25), LocalTime.of(19,0), "2h", performers);
    assertEquals("M", c.getName());
    assertArrayEquals(performers, c.getPerformers());
  }

  @Test
  public void testGuestTalkGetters() {
    GuestTalkEvent guestTalk = new GuestTalkEvent("T", "Loc", LocalDate.of(2025,11,20), LocalTime.of(10,0), "1h", "Speaker", "Abstract");
    assertEquals("Speaker", guestTalk.getSpeaker());
    assertEquals("Abstract", guestTalk.getAbstractText());
  }

  @Test
  public void testPartyGetters() {
    PartyEvent party = new PartyEvent("P", "L", LocalDate.of(2025,12,1), LocalTime.of(20,0), "4h", "Theme", "Dress");
    assertEquals("Theme", party.getTheme());
    assertEquals("Dress", party.getDressCode());
  }

  @Test
  public void testSportsGetters() {
    String[] teams = {"A","B"};
    SportsEvent sport = new SportsEvent("S", "Loc", LocalDate.of(2025,12,5), LocalTime.of(14,0), "90", teams, "detail");
    assertArrayEquals(teams, sport.getTeams());
    assertEquals("detail", sport.getDetails());
  }
}

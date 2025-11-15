import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestConcertEvent {

  @Test
  public void testConcertCreationAndGetters() {
    String[] performers = {"Blacko", "Kofi"};
    ConcertEvent c = new ConcertEvent("M", "L", LocalDate.of(2025,11,25), LocalTime.of(19,0), "2h", performers);
    assertEquals("M", c.getName());
    assertArrayEquals(performers, c.getPerformers());
  }
}

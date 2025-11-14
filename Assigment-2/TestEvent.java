import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestEvent {

    @Test
    public void testConcertEventCreation() {
        String[] performers = {"Blacko", "Kofi"};
        ConcertEvent concert = new ConcertEvent(
            "Music Night",
            "The Hive",
            LocalDate.of(2025, 11, 25),
            LocalTime.of(19, 0),
            "2 hours",
            performers
        );

        // Assertions to check concert event data
        assertEquals("Music Night", concert.getName());
        assertEquals("The Hive", concert.getLocation());
        assertEquals("Blacko", concert.getPerformers()[0]);
        assertEquals("Kofi", concert.getPerformers()[1]);
    }

    @Test
    public void testSportsEventCreation() {
        SportsEvent match1 = new SportsEvent(
            "ASHESI Games Final",
            "Ashesi Sports Complex",
            LocalDate.of(2024, 11, 2),
            LocalTime.of(15, 30),
            "2 hours",
            new String[] {"Elite FC", "Kasanoma"},
            "Ashesi Sports Complex"
        );

        assertArrayEquals(new String[]{"Elite FC", "Kasanoma"}, match1.getTeams());
        assertEquals("Ashesi Sports Complex", match1.getDetails());
        

    }

    @Test
    public void testPartyEventCreation() {
        PartyEvent party = new PartyEvent(
            "End of Semester Beach Party",
            "Labadi Beach",
            LocalDate.of(2024, 12, 7),
            LocalTime.of(12, 0),
            "All day",
            "Tropical Paradise"
        );

        assertEquals("Tropical Paradise", party.getTheme());
        assertEquals("Labadi Beach", party.getLocation());
    }

    @Test
    public void testTalkEventCreation() {
        GuestTalkEvent talk1 = new GuestTalkEvent(
            "AI in Modern Software Engineering",
            "Norton-Motulsky Hall",
            LocalDate.of(2024, 10, 25),
            LocalTime.of(14, 0),
            "1.5 hours",
            "Dr. Ayorkor Korsah",
            "Exploring the transformative impact of AI..."
        );
        
        assertEquals("Dr. Ayorkor Korsah", talk1.getSpeaker());
        assertEquals("Norton-Motulsky Hall", talk1.getLocation());

        GuestTalkEvent talk2 = new GuestTalkEvent(
            "Entrepreneurship in the Digital Age",
            "Online via Zoom",
            LocalDate.of(2024, 11, 5),
            LocalTime.of(17, 0),
            "1 hour",
            "Patrick Awuah",
            "A discussion on opportunities..."
        );
        
        assertEquals("Patrick Awuah", talk2.getSpeaker());
        assertEquals(LocalDate.of(2024, 11, 5), talk2.getDate());
    }

}

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Driver {
  public static void main(String[] args){

    // an ArrayList to hold different types of Event objects
    List<Event> events = new ArrayList<>();

    Event guestTalkEvent = new GuestTalkEvent(
      "FDE Master Class", 
      "The Banquet Hive",
      LocalDate.of(2025, 11, 25),
      LocalTime.of(14, 0),
      "2 hours",
      "Mrs Thomson Jewel",
      "Exploring all about ethnographic reserches before starting"
    );

    Event sportsEvent = new SportsEvent(
      "Ashesi Footbal League",
      "Ashesi Football Pitch",
      LocalDate.of(2025, 10, 25),
      LocalTime.of(11, 0),
      "2 hours",
      new String[]{"Kasanoma", "High landers"},
      "The final match of the annual ashesi football tournament."
    );

    Event concertEvent = new ConcertEvent(
      "Ustun Awards",
      "Ashesi Frontyard",
      LocalDate.of(2025, 9, 12),
      LocalTime.of(18, 0),
      "3.5 hours",
      new String[]{"Mide", "Ashley", "Stanley", "Roy"}
    );

    Event partyEvent = new PartyEvent(
      "Crazy Day Party",
      "RB 100",
      LocalDate.of(2025, 12, 31),
      LocalTime.of(22, 0),
      "4 hours",
      "Dress as much crazy as you can!😂😂"
    );

    // Add events to the list
    events.add(partyEvent);
    events.add(guestTalkEvent);
    events.add(sportsEvent);
    events.add(concertEvent);

    // Loop through the list and display information about each event
    System.out.println("  ASHESI UNIVERSITY EVENTS CALENDAR ");
    System.out.println("======================================== \n \n");


    for (Event event : events) {
        event.display();
    }
  }
}

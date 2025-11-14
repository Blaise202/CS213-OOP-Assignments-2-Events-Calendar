import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertEvent extends Event {
  private String[] performers;

  public ConcertEvent(String name, String location, LocalDate date, LocalTime time, String duration, String[] performers){
    super(name, location, date, time, duration);
    this.performers = performers;
  }

  public String[] getPerformers() {
    return performers;
  }

  @Override
  public void displaySpecificDetails() {
    System.out.println("Event Type: Concert");
    System.out.println("Performers: " + String.join(", ", performers));
  }
}

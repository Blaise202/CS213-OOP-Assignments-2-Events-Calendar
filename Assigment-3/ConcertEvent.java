import java.time.LocalDate;
import java.time.LocalTime;

import Interfaces.Performable;

public class ConcertEvent extends Event implements Performable {
  private String[] performers;

  public ConcertEvent(String name, String location, LocalDate date, LocalTime time, String duration, String[] performers){
    super(name, location, date, time, duration);
    this.performers = performers != null ? performers.clone() : new String[0];
  }

  @Override
  public String[] getPerformers() {
    return performers.clone();
  }

  @Override
  public void displaySpecificDetails() {
    System.out.println("Event Type: Concert");
    System.out.println("Performers: " + String.join(", ", performers));
  }
}
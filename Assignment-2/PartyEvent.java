import java.time.LocalDate;
import java.time.LocalTime;

public class PartyEvent extends Event {
  private String theme;

  public PartyEvent(String name, String location, LocalDate date, LocalTime time, String duration, String theme) {
    super(name, location, date, time, duration);
    this.theme = theme;
  }

  public String getTheme(){
    return theme;
  }

  @Override
  public void displaySpecificDetails(){
    System.out.println("Event Type: Party");
    System.out.println("Theme: " + theme);
  }
}

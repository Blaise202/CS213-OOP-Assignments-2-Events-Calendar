import java.time.LocalDate;
import java.time.LocalTime;

public class PartyEvent extends Event implements Themeable {
  private String theme;
  private String dressCode;

  public PartyEvent(String name, String location, LocalDate date, LocalTime time, String duration, String theme, String dressCode) {
    super(name, location, date, time, duration);
    this.theme = theme;
    this.dressCode = dressCode;
  }

  @Override
  public String getTheme() {
    return theme;
  }

  public String getDressCode() {
    return dressCode;
  }

  @Override
  public void displaySpecificDetails() {
      System.out.println("Event Type: Party");
      System.out.println("Theme: " + (theme != null ? theme : "NO THEME"));
      if (dressCode != null && !dressCode.isEmpty()) {
          System.out.println("Dress Code: " + dressCode);
      }
  }
}

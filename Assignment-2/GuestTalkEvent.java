import java.time.LocalDate;
import java.time.LocalTime;

public class GuestTalkEvent extends Event {

  // private attributes of guests' talks
  private String speaker;
  private String abstractText;

  // the constructor will also take the parameters
  public GuestTalkEvent(String name, String Location, LocalDate date, LocalTime time, String duration, String speaker, String abstractText){
    super(name, Location, date, time, duration); //super(extends the parametalized constructor of the parent class. in this case , it is "Event")
    this.speaker = speaker;
    this.abstractText = abstractText;
  }

  // getters
  public String getSpeaker(){
    return speaker;
  }
  public String getAbstracText(){
    return abstractText;
  }

  @Override
  public void displaySpecificDetails(){
    System.out.println("Event Type: Guest Talk");
    System.out.println("Speaker: " + speaker);
    System.out.println("Abstract: " + abstractText);
  }

}

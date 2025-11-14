import java.time.LocalDate;
import java.time.LocalTime;

import Interfaces.TeamBased;

public class SportsEvent extends Event implements TeamBased {
  private String[] teams;
  private String details;

  public SportsEvent(String name, String location, LocalDate date, LocalTime time, String duration, String[] teams, String details){
    super(name, location, date, time, duration);
    if(teams.length != 2){
      System.out.println("There must be exactly two teams");
      return;
    }
    this.teams = teams;
    this.details = details;
  }

  @Override
  public String[] getTeams(){
    return teams.clone();
  }
  
  @Override
  public String getDetails(){
    return details;
  }

  @Override
  public void displaySpecificDetails(){
    System.out.println("Event Type: Sports Event");
    System.out.println("Match: " + teams[0] + " vs " + teams[1]);
    System.out.println("Details: " + (details != null ? details : "N/A"));
  }
}

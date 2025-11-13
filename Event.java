import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Event {
    // Common attributes for all events
    protected String name;
    protected String location;
    protected LocalDate date;
    protected LocalTime time;
    protected String duration;

    // Parametarized constractor for all atributes
    public Event(String name, String location, LocalDate date, LocalTime time, String duration) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    // Getters for testing and information retrieval
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displaySpecificDetails();

    // Common display method for all events
    public void display() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("\n");
        System.out.println("Event: " + name);
        System.out.println("----------------------------------------");
        System.out.println("Location: " + location);
        System.out.println("Date: " + date.format(dateFormatter));
        System.out.println("Time: " + time.format(timeFormatter));
        System.out.println("Duration: " + duration);
        displaySpecificDetails(); // Polymorphic call
        System.out.println("----------------------------------------");
    }
}
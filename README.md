# **README – CS213 OOP Assignment 2: Events Calendar**

## **Overview**

This project implements an Events Calendar system using Object-Oriented Programming principles.
The system supports different types of events on campus by using inheritance and polymorphism.

The project includes:

- An abstract base class: **Event**
- Four subclasses:

  - **ConcertEvent**
  - **GuestTalkEvent**
  - **PartyEvent**
  - **SportsEvent**

- A driver program to demonstrate functionality
- Test files to verify class correctness

---

## **Project Structure**

```
Event.java
ConcertEvent.java
GuestTalkEvent.java
PartyEvent.java
SportsEvent.java
Driver.java
TestEvent.java  (or other test files)
UML_Diagram.png
README.md
```

---

## **How to Compile**

Open a terminal inside the project directory and run:

```bash
javac *.java
```

This compiles all classes in the project.

---

## **How to Run the Program**

Run the driver program:

```bash
java Driver
```

This will:

- Create multiple event objects from different event categories
- Store them in an `ArrayList<Event>`
- Loop through each event
- Display full information using polymorphism

Each event will show:

- Common details (name, location, date, time, duration)
- Subclass-specific details (performers, speaker, theme, teams, etc.)

---

## **Testing Instructions**

### **Manual Testing (Simplest Method)**

If JUnit is not configured, you can use the provided manual test file.

To run:

```bash
javac TestEvent.java
java TestEvent
```

The test checks:

- Constructor correctness
- Getter methods
- Attribute initialization
- Event-specific details

The test output will show whether each part passed or failed.

---

### **JUnit Testing (Optional)**

If you choose to use JUnit and have the dependencies:

Compile using:

```bash
javac -cp ".;dependencies/junit-4.13.2.jar;dependencies/hamcrest-core-1.3.jar" TestEvent.java
```

Run using:

```bash
java -cp ".;dependencies/junit-4.13.2.jar;dependencies/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestEvent
```

This will run the automated unit tests.

---

## **Design**

The design follows a UML diagram (included as `UML_Diagram.png`).
All subclasses inherit from `Event` and override the abstract method `displaySpecificDetails()`.

The structure demonstrates proper use of:

- Abstraction
- Inheritance
- Encapsulation
- Polymorphism

---

## **Notes**

- Code is organized in a flat structure as required.
- LocalDate and LocalTime are used for accurate date/time handling.
- Display methods use formatted output for readability.
- Tests focus on correctness and robustness of attributes/methods.

# **CS213 - OOP Assignment 3 (Phase 2) — Events Calendar**

## **What changed (Phase 2)**

I introduced interfaces to establish relationships (realization) between classes.
Interfaces added:

- **Performable**
- **Talkable**
- **Themeable**
- **TeamBased**

Each subclass implements the interface relevant to its type:

- ConcertEvent implements Performable
- GuestTalkEvent implements Talkable
- PartyEvent implements Themeable
- SportsEvent implements TeamBased

## **Files included**

- Event.java
- ConcertEvent.java
- GuestTalkEvent.java
- PartyEvent.java
- SportsEvent.java
- Performable.java
- Talkable.java
- Themeable.java
- TeamBased.java
- JUnit test files: ConcertEventTest.java, GuestTalkEventTest.java, PartyEventTest.java, SportsEventTest.java

## **Quick compile & run (no JUnit)**

1. Open terminal in project folder.
2. Compile all Java files except for JUnit the tests.

## **Run JUnit tests**

1. Place JUnit jars (junit-4.13.2.jar, hamcrest-core-1.3.jar) into `dependencies/`.
2. Compile:

```
javac -cp ".;dependencies/junit-4.13.2.jar;dependencies/hamcrest-core-1.3.jar" TestPartyEvent.java TestGuestTalkEvent.java TestConcertEvent.java TestSportsEvent.java
```

3. Run tests:

```
java -cp ".;dependencies/junit-4.13.2.jar;dependencies/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestPartyEvent TestGuestTalkEvent TestConcertEvent TestSportsEvent
```

(Replace `;` by `:` on macOS/Linux.)

## **Notes for the further info**

- The design followed the Phase 2 requirement: classes implement interfaces rather than adding new inheritance.
- The `display()` method demonstrates polymorphism; `displaySpecificDetails()` is overridden in each subclass.

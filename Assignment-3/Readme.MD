# CS213 - OOP Assignment 3 (Phase 2) — Events Calendar

## What changed (Phase 2)

I introduced interfaces to establish relationships (realization) between classes.
Interfaces added:

- Performable
- Talkable
- Themeable
- TeamBased

Each subclass implements the interface relevant to its type:

- ConcertEvent implements Performable
- GuestTalkEvent implements Talkable
- PartyEvent implements Themeable
- SportsEvent implements TeamBased

## Files included

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

## Quick compile & run (no JUnit)

1. Open terminal in project folder.
2. Compile all Java files except for JUnit the tests.

## Run JUnit tests

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

## Notes for the instructor

- The design followed the Phase 2 requirement: classes implement interfaces rather than adding new inheritance.
- The `display()` method demonstrates polymorphism; `displaySpecificDetails()` is overridden in each subclass.

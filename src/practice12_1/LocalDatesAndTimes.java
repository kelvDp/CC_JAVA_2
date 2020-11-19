package practice12_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*; // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*; // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {

    // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
    // How old when he died?
    // How many days did he live?
    LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
    LocalDate abeDies = LocalDate.of(1855, APRIL, 15);
    System.out.println("Abe was " + abeBorn.until(abeDies, YEARS) + " when he died.");
    System.out.println("He lived " + abeBorn.until(abeDies, DAYS) + " days.");
    System.out.println();

    // Bennedict Cumberbatch, July 19, 1976
    // Born in a leap year?
    // How many days in the year he was born?
    // How many decades old is he?
    // What was the day of the week on his 21st birthday?
    LocalDate benBorn = LocalDate.of(1976, JULY, 19);
    boolean isLeapYear = benBorn.isLeapYear();
    System.out.println("Bennedict was born in a leap year: " + isLeapYear);
    int daysInYearBorn = benBorn.lengthOfYear();
    System.out.println("There were " + daysInYearBorn + " days in the year he was born.");
    LocalDate now = LocalDate.now();
    System.out.println("He is " + benBorn.until(now, DECADES) + " decades old by now.");
    System.out.println("It was a " + benBorn.plusYears(21).getDayOfWeek() + " on his 21st bday");
    System.out.println();

    // Train departs Boston at 1:45PM and arrives New York 7:25PM
    // How many minutes long is the train ride?
    // If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
    LocalTime depart = LocalTime.of(13, 45);
    LocalTime arrive = LocalTime.of(19, 25);
    System.out.println("The train ride was " + depart.until(arrive, MINUTES) + " minutes long.");
    System.out.println("If train gets delayd, arrival time will be: " + arrive.plusHours(1).plusMinutes(19));
    System.out.println();

    // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15
    // minutes
    // When does it arrive in Miami?
    // When does it arrive if the flight is delays 4 hours 27 minutes?
    LocalDateTime flightLeave = LocalDateTime.of(2020, MARCH, 24, 21, 15);
    LocalDateTime flightArrive = flightLeave.plusHours(4).plusMinutes(15);
    System.out.println("The flight should arrive at " + flightArrive);
    System.out.println("If there is a delay: " + flightArrive.plusHours(4).plusMinutes(27));
    System.out.println();

    // School semester starts the second Tuesday of September of this year.
    // Hint: Look at the TemporalAdjusters class
    // What is the date?
    // School summer vacation starts June 25th
    // Assuming:
    // * Two weeks off in December
    // * Two other vacation weeks
    // * School is taught Monday - Friday
    // How many days of school are there?
    // Hint: keep track of the short weeks also
    int exludedWeeks = 5;
    LocalDate schoolStart = LocalDate.of(2020, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY))
        .with(TemporalAdjusters.next(TUESDAY));
    LocalDate schoolEnds = LocalDate.of(2021, JUNE, 25);

    LocalDate endOfFirstWeek = schoolStart.with(TemporalAdjusters.next(FRIDAY));
    long firstWeekDays = schoolStart.until(endOfFirstWeek, DAYS) + 1;
    System.out.println("School starts: " + schoolStart);
    System.out.println("School ends: " + schoolEnds);

    long lasWeekDays = 0;

    if (schoolEnds.getDayOfWeek() != MONDAY) {
      LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
      lasWeekDays = lastWeekStart.until(schoolEnds, DAYS) + 1;
      exludedWeeks++;
    }

    long days = ((schoolStart.until(schoolEnds, WEEKS) - exludedWeeks) * 5);
    days = days + firstWeekDays + lasWeekDays;
    System.out.println("Number of school days: " + days);
    System.out.println();

    // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume
    // it is today.
    // What is the time of the week's meetings?
    LocalTime meetingTime = LocalTime.of(13, 30);
    LocalDate meetingDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
    LocalDateTime meeting = LocalDateTime.of(meetingDate, meetingTime);
    System.out.println("The meeting is: " + meeting);

  }

}

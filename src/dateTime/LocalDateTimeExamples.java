package dateTime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2017, 12, 2, 6, 0, 0);
        LocalDateTime ldt2 = ldt.plus(1, ChronoUnit.MILLIS);
        LocalTime time = LocalTime.now();
        System.out.println(Duration.between(time, ldt));    // PT-11H-15M-18.704S
        System.out.println("Now = " + time);                // Now = 17:15:18.704

        ZoneId nyZone = ZoneId.of("America/New_York");
        ZoneId laZone = ZoneId.of("America/Los_Angeles");

        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        ZonedDateTime nyZdt2 = ldt2.atZone(nyZone);
        ZonedDateTime laZdt = ldt2.atZone(laZone);
        System.out.println(Duration.between(nyZdt, nyZdt2));    // PT0.001S
        System.out.println(Duration.between(laZdt, nyZdt));     // PT-3H-0.001S

        System.out.println(Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1)));     // P-2Y-6M-25D
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 1, 6, 0, 0)));   // PT-22499H-16M-36.48S

        Instant ins = Instant.parse("2015-06-25T16:43:30.00z");
        ins.plus(10, ChronoUnit.HOURS);
        System.out.println(ins); // 2015-06-25T16:43:30Z
        // Duration.between(time, ins); --> java.time.DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2015-06-25T16:43:30Z of type java.time.Instant
        // Period.between(ins, time);  -> not compiled

        Duration timeToCook = Duration.ofHours(1);
        Instant readyTime = ins.plus(timeToCook);
        System.out.println(readyTime); // 2015-06-25T17:43:30Z

        System.out.println(LocalDateTime.ofInstant(readyTime, ZoneId.of("GMT+2"))); // 2015-06-25T19:43:30

        LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x); // -2

        System.out.println(Instant.ofEpochSecond(3));  // 1970-01-01T00:00:03Z
        System.out.println(Instant.ofEpochSecond(3, -1000000000));   // 1970-01-01T00:00:02Z
        System.out.println(Instant.now().get(ChronoField.NANO_OF_SECOND));  //626000000

        System.out.println(LocalDateTime.of(2014, 3, 2, 2, 3, 4).get(ChronoField.YEAR));  // 2014
        System.out.println(LocalDate.of(2014, 3, 18).plusWeeks(1)); // 2014-03-25
        System.out.println(LocalDate.of(2014, 3, 18).plus(1, ChronoUnit.MONTHS)); // 2014-04-18

        LocalDateTime d = LocalDateTime.of(2018, 3, 26, 4, 5, 6);
        ZonedDateTime dZ = d.atZone(laZone);
        LocalDateTime d2 = LocalDateTime.of(2018, 3, 26, 4, 5, 6);
        ZonedDateTime dZ2 = d.atZone(ZoneId.systemDefault());
       // System.out.println(Duration.between(dZ, LocalDateTime.of(2018, 3, 26, 4, 5, 6)));  // java.time.DateTimeException: Unable to obtain ZonedDateTime from TemporalAccessor: 2018-03-26T04:05:06 of type java.time.LocalDateTime
        System.out.println(Duration.between(LocalDateTime.of(2018, 3, 26, 4, 5, 6), dZ));   // OK! converts to the first variable so zone is striped off --> PT0S
        System.out.println(Duration.between(dZ, dZ2)); // PT-3H


        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date); // 2015-11-01T09:00-05:00[US/Eastern]

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date); // 2015-11-01T10:00-05:00[US/Eastern]

        System.out.println(LocalDateTime.now()); //2018-03-26T19:22:23.419
        System.out.println(Instant.now()); // 2018-03-26T19:22:23.419Z

        // 12345th second of day (03:25:45)
        System.out.println(LocalTime.ofSecondOfDay(12345));

        ZoneOffset newYorkOffset = ZoneOffset.of("-05:00");
        System.out.println(OffsetDateTime.of(LocalDateTime.of(2014, 4, 5, 4, 5 ,5), newYorkOffset));  // 2014-04-05T04:05:05-05:00
        // LocalTime or LocalDate is not compiled
    }
}

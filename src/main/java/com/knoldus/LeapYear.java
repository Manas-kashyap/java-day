package com.knoldus;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.stream.IntStream;

public class LeapYear {
    void leap() {
        ZonedDateTime currentTime = ZonedDateTime.now();
        int endYear = currentTime.getYear();
        int startYear = 1950;
        System.out.println("Leap year between" + startYear + "and" + endYear);
        IntStream.range(startYear, endYear)
                .filter(year -> LocalDate.parse(year + "-01-01").isLeapYear()).forEach(System.out::println);
    }
}

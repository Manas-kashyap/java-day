package com.knoldus;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DayOfWeek {
    ZonedDateTime currentTime = ZonedDateTime.now();
    int endYear = currentTime.getYear();

    List<String> getDays(int year) {
        return IntStream.range(year, endYear)
                .mapToObj(y -> LocalDate.parse(y + "-09-08").getDayOfWeek().toString()).collect(Collectors.toList());
    }
}


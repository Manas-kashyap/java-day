package com.knoldus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppDriver {
    public static void main(String[] args) throws ParseException {
/*        TimeOfTimeZone zonerTime = new TimeOfTimeZone();
        zonerTime.timeZoneTime();
        SecondsLived livedTime = new SecondsLived();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth date in yy/MM/dd format");
        Date birth = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        System.out.println("Enter death date in yy/MM/dd format");
        Date death = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        livedTime.countSeconds(birth, death);
        LeapYear leap = new LeapYear();
        leap.leap();
        DayOfWeek weekdays = new DayOfWeek();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter year from which time you want to check (the date given is 8th sept");
        int week = Integer.parseInt(sc2.nextLine());
        System.out.println(weekdays.getDays(week));*/
        String filePath = "./src/main/resources/words.txt";
        Count c = new Count();
        System.out.println(c.getWordCountOfDataFromFile(filePath));
    }
}

package com.knoldus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppDriver {
    public static void main(String[] args) throws ParseException {
        TimeOfTimeZone zonerTime = new TimeOfTimeZone();
        zonerTime.timeZoneTime();
        SecondsLived livedTime = new SecondsLived();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth date in yy/MM/dd format");
        Date birth = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        System.out.println("Enter death date in yy/MM/dd format");
        Date death = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        livedTime.countSeconds(birth,death);
        LeapYear leap = new LeapYear();
        leap.leap();
    }
}

package com.knoldus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeOfTimeZone {
    void timeZoneTime() {

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time zone , example:- Europe/Madrid , Asia/Kolkata");
        String zone = sc.nextLine();
        df.setTimeZone(TimeZone.getTimeZone(zone));
        System.out.println("Date and time in  " + zone + " " + df.format(date));
    }
}

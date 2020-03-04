package com.knoldus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondsLived {
    void countSeconds(Date birthDate, Date deathDate) {
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
        double difference = birthDate.getTime() - deathDate.getTime();
        double secondsCount = difference/1000;
        System.out.println("Number of seconds lived "+secondsCount);
    }
}

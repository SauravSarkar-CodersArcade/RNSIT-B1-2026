package com.basics.dateClassExamples;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date/Time: " + dateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, 'day of the year', dd MMM yyyy");
        String formattedDateTime = dateTime.format(format);
        /*
        E - Name of the week
        d - Day of the month
        M - Month Number
        MM - 01
        MMM - Month Name
        D -> Day of the year (1-366)
         */
        System.out.println("Formatted Date: " + formattedDateTime);

    }
}

package be.vdab.Ex204CompareCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCompareCalendar {

    public static void main(String[] args) {

        int amountOfCalendars = 10;
        String[] calendars = new String[amountOfCalendars];

        for (int i = 0; i < amountOfCalendars; i++) {
            LocalDate calendar = LocalDate.now();
            calendar = calendar.plusDays(20-i);
            calendars[i] = calendar.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }

        System.out.println("\noriginal order");
        for (int i = 0; i < amountOfCalendars; i++) {
            System.out.println(calendars[i]);
        }

    }

}

package be.vdab.Ex204CompareDates_Arrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class TestCompareCalendar {

    public static void main(String[] args) {

        int amountOfDates = 10;
        LocalDate[] dates = new LocalDate[amountOfDates];
        String[] datesAsString = new String[amountOfDates];

        // array LocalDate objects
        for (int i = 0; i < amountOfDates; i++) {
            LocalDate date = LocalDate.now();
            date = date.plusDays(20-i);
            dates[i] = date;
        }

        // print original array
        System.out.println("\noriginal array");
        for (int i = 0; i < amountOfDates; i++) {
            datesAsString[i] = dates[i].format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        for (int i = 0; i < amountOfDates; i++) {
            System.out.println(datesAsString[i]);
        }

        // sort array LocalDate objects
        sort(dates,new CalendarComparator());

        // print sorted order
        System.out.println("\noriginal array");
        for (int i = 0; i < amountOfDates; i++) {
            datesAsString[i] = dates[i].format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        for (int i = 0; i < amountOfDates; i++) {
            System.out.println(datesAsString[i]);
        }

    }

    public static void sort (LocalDate[] dates,Comparator<LocalDate> comparator) {
        boolean sorted = false;
        LocalDate temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < dates.length - 1; i++) {
                if (comparator.compare(dates[i],dates[i+1]) > 0) {
                    temp = dates[i];
                    dates[i] = dates[i+1];
                    dates[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

}

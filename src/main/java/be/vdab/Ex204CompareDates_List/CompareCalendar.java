package be.vdab.Ex204CompareDates_List;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareCalendar {

    public static void main(String[] args) {

        int amountOfDates = 10;
        List<LocalDate> dates = new ArrayList<>(amountOfDates);
        List<String> datesAsString = new ArrayList<>(amountOfDates);

        // list LocalDate objects
        for (int i = 0; i < amountOfDates; i++) {
            LocalDate date = LocalDate.now();
            date = date.plusDays(20 - i);
            dates.add(date);
        }

        // print original list (convert to "dd-MM-yyyy" first)
        System.out.println("\noriginal list");
        for (int i = 0; i < amountOfDates; i++) {
            datesAsString.add(dates.get(i).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        for (int i = 0; i < amountOfDates; i++) {
            System.out.println(datesAsString.get(i));
        }

        // sort list LocalDate objects, DOESN'T WORK
        Collections.sort(dates, new CalendarComparator());

        // print sorted list (convert to "dd-MM-yyyy" first)
        System.out.println("\nsorted list");
        for (int i = 0; i < amountOfDates; i++) {
            datesAsString.add(dates.get(i).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        for (int i = 0; i < amountOfDates; i++) {
            System.out.println(datesAsString.get(i));
        }

    }
}
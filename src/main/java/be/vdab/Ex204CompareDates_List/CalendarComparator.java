package be.vdab.Ex204CompareDates_List;

import java.time.LocalDate;
import java.util.Comparator;

public class CalendarComparator implements Comparator<LocalDate> {
    public int compare(LocalDate date1, LocalDate date2) {
        if (date1.getDayOfMonth() < date2.getDayOfMonth()) {
            return 1;
        } else if (date1.getDayOfMonth() > date2.getDayOfMonth()) {
            return -1;
        } else {
            if (date1.getMonthValue() < date2.getMonthValue()) {
                return 1;
            } else if (date1.getMonthValue() > date2.getMonthValue()) {
                return -1;
            } else {
                if (date1.getYear() < date2.getYear()) {
                    return 1;
                } else if (date1.getYear() > date2.getYear()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}


package be.vdab.Ex217CountOccurrenceOfWords;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;

public class OccurenceComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue() > o2.getValue()) {
            return 1;
        } else if (o1.getValue() < o2.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}

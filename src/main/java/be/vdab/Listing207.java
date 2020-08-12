package be.vdab;

import java.util.*;
import static java.util.Arrays.sort;

public class Listing207 {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        sort(cities,new MyComparator());
        for (String string : cities) {
            System.out.print(string + " ");
        }
    }
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String string1, String string2) {
            return string2.length()-string1.length();
        }
    }
}

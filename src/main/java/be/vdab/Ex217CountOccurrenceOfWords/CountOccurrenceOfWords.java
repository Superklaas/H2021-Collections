package be.vdab.Ex217CountOccurrenceOfWords;

import java.util.*;

public class CountOccurrenceOfWords {

    public static void main(String[] args) {

        // declaration
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split("[\\s+\\p{Punct}]");

        // fill the map with entries <word,count>
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int count;
            if(word.length()>0) {
                if (!map.containsKey(word)) {
                    map.put(word,1);
                } else {
                    count = map.get(word);
                    count++;
                    map.put(word, count);
                }
            }
        }

        // sort the map by ascending order of occurrence counts
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        Collections.sort(list, new OccurenceComparator());

        // print entries map
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}




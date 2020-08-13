package be.vdab;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex206IteratorOnArrayList {

    public static void main(String[] args) {

        // Make arraylist with 10 million integers
        int lengthList = 10000000;
        ArrayList<Integer> list = new ArrayList<>(lengthList);
        for (int i = 0; i < lengthList; i++) {
            list.add(i+1);
        }

        // Elapsed time for get(index)
        long beforeGet = System.currentTimeMillis();
        for (int i = 0; i < lengthList; i++) {
            list.get(i);
        }
        long afterGet = System.currentTimeMillis();
        System.out.println("Elapsed time for get(index): " + (afterGet-beforeGet) + "ms");

        // Elapsed time for iterator
        long beforeIterator = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
        long afterIterator = System.currentTimeMillis();
        System.out.println("Elapsed time for iterator: " + (afterIterator-beforeIterator) + "ms");

    }
}

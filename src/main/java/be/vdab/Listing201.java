package be.vdab;

import java.util.*;

public class Listing201 {
    public static void main(String[] args) {

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Atlanta");
        collection1.add("Boston");
        collection1.add("Phoenix");
        collection1.add("Dallas");
        collection1.add("Seattle");

        System.out.println("list of cities in collection 1: " + collection1);
        System.out.println("Is Dallas in collection? " + collection1.contains("Dallas"));
        collection1.remove("Dallas");
        System.out.println("After removal Dallas: " + collection1.size() + " elements are in collection now");
        System.out.println("Is Dallas in collection? " + collection1.contains("Dallas"));

        ArrayList<String> collection2 = new ArrayList<>();
        collection2.add("Atlanta");
        collection2.add("Madison");
        collection2.add("New York");
        collection2.add("Seattle");

        System.out.println("\nlist of cities in collection 2: " + collection2);

        ArrayList<String> c1 = (ArrayList<String>) collection1.clone();
        c1.addAll(collection2);
        System.out.println("\nlist of cities in collection 1 UNION collection 2: " + c1);

        ArrayList<String> c2 = (ArrayList<String>) collection1.clone();
        c2.retainAll(collection2);
        System.out.println("\nlist of cities in collection 1 INTERSECT collection 2: " + c2);

        ArrayList<String> c3 = (ArrayList<String>) collection1.clone();
        c3.removeAll(collection2);
        System.out.println("\nlist of cities in collection 1 MINUS collection 2: " + c3);

    }
}

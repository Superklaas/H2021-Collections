package be.vdab;

import java.util.*;

public class Checkpoint2052 {
    public static void main(String[] args) {

        List<String> list1Temp = Arrays.asList("red", "yellow", "green");
        List<String> list2Temp = Arrays.asList("red", "yellow", "blue");

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(list1Temp);
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list2Temp);

        System.out.println("INITIAL LISTS");
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("addAll");
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("removeAll");
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("retainAll");
        list1.retainAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}

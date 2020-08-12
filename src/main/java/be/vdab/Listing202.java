package be.vdab;

import java.util.ArrayList;
import java.util.Iterator;

public class Listing202 {
    public static void main(String[] args) {

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Atlanta");
        collection1.add("Boston");
        collection1.add("Phoenix");
        collection1.add("Dallas");

        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

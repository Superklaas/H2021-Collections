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
        collection1.remove(0);
        System.out.println(collection1.get(0));
        collection1.add(0,"Portland");
        System.out.println(collection1);

        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

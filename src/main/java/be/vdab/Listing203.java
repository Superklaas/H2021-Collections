package be.vdab;

import java.util.ArrayList;

public class Listing203 {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Atlanta");
        collection1.add("Boston");
        collection1.add("Phoenix");
        collection1.add("Dallas");
        collection1.forEach(e-> System.out.println(e));
    }
}

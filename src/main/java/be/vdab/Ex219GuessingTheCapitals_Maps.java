package be.vdab;

import java.util.*;

public class Ex219GuessingTheCapitals_Maps {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        map.put("West-Vlaanderen", "Brugge");
        map.put("Oost-Vlaanderen", "Gent");
        map.put("Antwerpen", "Antwerpen");
        map.put("Vlaams-Brabant", "Leuven");
        map.put("Limburg", "Hasselt");
        map.put("Hainaut", "Mons");
        map.put("Namur", "Namur");
        map.put("Brabant wallon", "Wavre");
        map.put("Liège", "Liège");
        map.put("Luxembourg", "Arlon");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("Enter a province or type stop");
        String input = scan.nextLine();
        while (!input.equals("stop")) {
            boolean match = false;
            for (Map.Entry<String, String> entry : entries) {
                if (input.equals(entry.getKey())) {
                    System.out.println("The capital of " + input + " is " + entry.getValue());
                    match = true;
                }
            }
            if (!match) {
                System.out.println("Not a valid input");
            }
            System.out.println("Enter a province or type stop");
            input = scan.nextLine();
        }
    }
}

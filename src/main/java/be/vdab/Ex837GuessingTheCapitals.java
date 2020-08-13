package be.vdab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex837GuessingTheCapitals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] provinces = {
                {"West-Vlaanderen", "Brugge"},
                {"Oost-Vlaanderen", "Gent"},
                {"Antwerpen", "Antwerpen"},
                {"Vlaams-Brabant", "Leuven"},
                {"Limburg", "Hasselt"},
                {"Hainaut", "Mons"},
                {"Namur", "Namur"},
                {"Brabant wallon", "Wavre"},
                {"Liège", "Liège"},
                {"Luxembourg", "Arlon"},
        };

        int score = 0;
        for (int i = 0; i < provinces.length; i++) {
            System.out.println("What is the capital of " + provinces[i][0]);
            String answer = scan.nextLine();
            if(answer.equals(provinces[i][1])) {
                System.out.println("Correct answer\n");
                score++;
            } else {
                System.out.println("Incorrect answer");
                System.out.println("The correct answer should be " + provinces[i][1] + "\n");
            }
        }
        System.out.println("Your score is " + score + "/" + provinces.length);

    }

}

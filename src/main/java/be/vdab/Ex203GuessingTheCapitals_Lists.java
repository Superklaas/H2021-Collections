package be.vdab;

import java.util.*;

public class Ex203GuessingTheCapitals_Lists {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberProvinces = 10;
        String[][] provincesArray = {
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

        List<List<String>> provincesList = new ArrayList<>(numberProvinces);
        for (int i = 0; i < numberProvinces; i++) {
            List<String> perProvince = Arrays.asList(provincesArray[i]);
            provincesList.add(perProvince);
        }

        Collections.shuffle(provincesList);

        int score = 0;
        for (int i = 0; i < numberProvinces; i++) {
            System.out.println("What is the capital of " + provincesList.get(i).get(0));
            String answer = scan.nextLine();
            if (answer.equals(provincesList.get(i).get(1))){
                System.out.println("Correct answer\n");
                score++;
            } else {
                System.out.println("Incorrect answer");
                System.out.println("The correct answer should be " + provincesArray[i][1] + "\n");
            }
        }
        System.out.println("Your score is " + score + "/" + numberProvinces);

    }

}

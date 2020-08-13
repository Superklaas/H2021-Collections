package be.vdab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex208Lottery {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = 3;

        // make winning number (random)
        List<Integer> winningNumber = new ArrayList<>(amountOfNumbers);
        for (int i = 0; i < amountOfNumbers; i++) {
            winningNumber.add(random.nextInt(10));
        }
        System.out.println("winningNumber: " + winningNumber);

        // choose number (scanner)
        List<Integer> chosenNumber = new ArrayList<>(amountOfNumbers);
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.println("Enter number " + (i+1));
            chosenNumber.add(scanner.nextInt(10));
        }
        System.out.println("chosenNumber: " + chosenNumber);

        // compare chosenNumber to winningNumber
        int counter = 0;
        List<Integer> matchingNumbers = new ArrayList<>();
        for (int i = 0; i < amountOfNumbers; i++) {
            for (int j = 0; j < amountOfNumbers; j++) {
                if ((winningNumber.get(i)==chosenNumber.get(j)) && (matchingNumbers.contains(winningNumber.get(i))==false)) {
                    matchingNumbers.add(winningNumber.get(i));
                    counter++;
                }
            }
        }

        // determine price
        if(winningNumber.equals(chosenNumber)) {
            System.out.println("All numbers correct in right order: $12000");
        } else if(winningNumber.containsAll(chosenNumber)) {
            System.out.println("All numbers correct in wrong order: $5000");
        } else if (counter == 2) {
            System.out.println("2 numbers correct: $4000");
        } else if (counter == 1) {
            System.out.println("1 number correct: $2000");
        } else {
            System.out.println("Better luck next time");
        }

    }
}

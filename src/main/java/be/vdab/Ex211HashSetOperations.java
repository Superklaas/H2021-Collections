package be.vdab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex211HashSetOperations {
    public static void main(String[] args) {

        String[] array1 = {"Chemistry", "Mathematics", "Biology", "English"};
        String[] array2 = {"Biology", "English", "Geography", "Physics"};
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        Set<String> set1Clone1 = (Set<String>) ((HashSet<String>) set1).clone();
        Set<String> set2Clone1 = (Set<String>) ((HashSet<String>) set2).clone();
        set1Clone1.removeAll(set2Clone1);
        System.out.println("only present in the first stack: " + set1Clone1);

        Set<String> set1Clone2 = (Set<String>) ((HashSet<String>) set1).clone();
        Set<String> set2Clone2 = (Set<String>) ((HashSet<String>) set2).clone();
        set2Clone2.removeAll(set1Clone2);
        System.out.println("only present in the second stack: " + set2Clone2);

        Set<String> set1Clone3 = (Set<String>) ((HashSet<String>) set1).clone();
        Set<String> set2Clone3 = (Set<String>) ((HashSet<String>) set2).clone();
        set1Clone3.retainAll(set2Clone3);
        System.out.println("present in both stacks: " + set1Clone3);

    }
}

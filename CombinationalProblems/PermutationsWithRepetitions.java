package CombinationalProblems;

import java.util.HashSet;
import java.util.Scanner;

public class PermutationsWithRepetitions {

    public static String[] elements;
    public static String[] permutes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");
        permutes = new String[elements.length];

        permute(0);
    }

    private static void permute(int index) {
        if(index == elements.length){
            printResult(elements);
            return;
        }

        permute(index + 1);
        HashSet<String> swapped = new HashSet<>();
        swapped.add(elements[index]);
        for (int i = index + 1; i < elements.length; i++) {
            if(!swapped.contains(elements[i])){
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
                swapped.add(elements[i]);
            }
        }
    }

    private static void swap(String[] elements, int first, int second) {
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }

    private static void printResult(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}

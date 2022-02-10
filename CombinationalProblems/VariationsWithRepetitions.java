package CombinationalProblems;

import java.util.Scanner;

public class VariationsWithRepetitions {
    public static String[] elements;
    public static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        variations = new String[k];


        variations(0);


    }

    private static void variations(int index) {
        if(index == variations.length){ // проверката до която трябва да спре рекурсията
            printResult(variations);
            return;
        }

        for (int i = 0; i < elements.length; i++) {

                variations[index] = elements[i];
                variations(index + 1); // викани рекурсията
        }
    }

    private static void printResult(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}

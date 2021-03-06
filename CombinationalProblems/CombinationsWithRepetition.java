package CombinationalProblems;

import java.util.Scanner;

public class CombinationsWithRepetition {

    public static String[] elements; //дадени от конзолата
    public static String[] variations; // добавяме комбинациите

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        variations = new String[k];


        combinations(0, 0);


    }

    private static void combinations(int index, int start) {
        if(index == variations.length){
            printResult(variations);
            return;
        }

        for (int i = start; i < elements.length; i++) {
            variations[index] = elements[i];
            combinations(index + 1, i);
        }

    }

    private static void printResult(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}

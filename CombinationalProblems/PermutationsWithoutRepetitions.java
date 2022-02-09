package CombinationalProblems;

import java.util.Scanner;

public class PermutationsWithoutRepetitions {

    public static String[] elements;
    public static String[] permutes; // where we are adding the elements
    public static boolean[] used; // when we are delete used elements

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");
        permutes = new String[elements.length];
        used = new boolean[elements.length];

        permute(0);
    }

    private static void permute(int index) {
        if(index == elements.length){  // дъното на рекурсията
            printResult();
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if(!used[i]){
                used[i] = true;
                permutes[index] = elements[i];
                permute(index + 1);
                used[i] = false;
            }
        }
    }

    private static void printResult() {
        System.out.println(String.join(" ", permutes));
    }
}

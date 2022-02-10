package ExerciseRecursionAndCombinatorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsWithRepetition {

    public static int[] elements;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine()); // number of cell

        elements = new int[k];

        combinations(0, 1); // start is value when we start loop

    }

    private static void combinations(int index, int start) {
        if(index == elements.length){
            printResult();
            return;
        }

        for (int i = start; i <= n; i++) {
            elements[index] = i;
            combinations(index + 1, i);
        }

    }

    private static void printResult() {
        for (int element : elements) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}

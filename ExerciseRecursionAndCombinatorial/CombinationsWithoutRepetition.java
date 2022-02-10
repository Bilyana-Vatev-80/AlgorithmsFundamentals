package ExerciseRecursionAndCombinatorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsWithoutRepetition {

    public static int[] elements;
    public static int n;
    public static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        k = Integer.parseInt(reader.readLine());

        elements = new int[k];

        combinations(0, 1);
    }

    private static void combinations(int index, int start) {
        if(index == elements.length){
            printElements();
            return;
        }

        for (int i = start; i <= n; i++) {
            elements[index] = i;
            combinations(index + 1, i + 1);
        }
    }

    private static void printElements() {
        for (int element : elements) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}

package SearchingSortingAndGreedyAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 2, 5, 6};

        bubble(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void bubble(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}

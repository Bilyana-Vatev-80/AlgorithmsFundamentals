package IntervieQuestions.HowToSeparateZerosFromNonZerosInAnArray;

import java.util.Arrays;

public class MoveZeroElementsFront {
    public static void main(String[] args) {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

    private static void moveZerosToFront(int[] numberArrays) {
        int counter = numberArrays.length - 1;

        for (int i = numberArrays.length - 1; i >= 0; i--) {
            if(numberArrays[i] != 0){ // ако индекса не е нула намаляме бройката с 1
                numberArrays[counter] = numberArrays[i];

                counter--;
            }
        }

        while (counter >= 0){  // добавяме нулите отпред
            numberArrays[counter] = 0;
            counter--;
        }

        System.out.println(Arrays.toString(numberArrays));
    }
}

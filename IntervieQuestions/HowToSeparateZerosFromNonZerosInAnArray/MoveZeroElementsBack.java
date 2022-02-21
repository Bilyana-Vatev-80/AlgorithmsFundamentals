package IntervieQuestions.HowToSeparateZerosFromNonZerosInAnArray;

import java.util.Arrays;

public class MoveZeroElementsBack {
    public static void main(String[] args) {
        moveZerosToEnd(new int[]{12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

    private static void moveZerosToEnd(int[] numberArrays) {
        int counter = 0;

        //Traversing inputArray from left to right
        for (int i = 0; i < numberArrays.length; i++) {
            if(numberArrays[i] != 0){
                numberArrays[counter] = numberArrays[i];

                counter++;
            }
        }

        //Assigning zero to remaining elements
        while (counter < numberArrays.length){
            numberArrays[counter] = 0;

            counter++;
        }

        System.out.println(Arrays.toString(numberArrays));
    }
}

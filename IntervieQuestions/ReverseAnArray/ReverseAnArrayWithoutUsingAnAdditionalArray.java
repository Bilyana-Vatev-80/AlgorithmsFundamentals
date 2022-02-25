package IntervieQuestions.ReverseAnArray;

import java.util.Arrays;

public class ReverseAnArrayWithoutUsingAnAdditionalArray {
    public static void main(String[] args) {
        /*
        Write a java program to reverse an array without using an additional array.
        That means your program should reverse the given array in place.
        For example, if {12, 9, 21, 17, 33, 7} is the input array,
        then your program should return {7, 33, 17, 21, 9, 12} as output.
         */
        reverseArray(new int[]{4, 5, 8, 9, 10});
    }

    private static void reverseArray(int[] array) {
        int temp;

        /*
         Iterate over only half of the inputArray (inputArray.length / 2).
          For every ith element,
         swap it with (inputArray.length-1-i)th element.
         */
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}

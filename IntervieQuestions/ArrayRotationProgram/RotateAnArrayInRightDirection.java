package IntervieQuestions.ArrayRotationProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArrayInRightDirection {
    public static void main(String[] args) {

        rightRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
    }

    private static void rightRotate(int[] array, int position) {

        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(array));

        int temp;

        for (int i = 1; i <= position; i++) {
            temp = array[array.length - 1]; // set the index tp the end of array

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = temp; // index == 0
        }

        System.out.println(Arrays.toString(array));

    }
}

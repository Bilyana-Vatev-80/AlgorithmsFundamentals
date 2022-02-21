package IntervieQuestions.ArrayRotationProgram;

import java.util.Arrays;

public class RotateAnArrayInTheLeftDirection {
    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
    }

    private static void leftRotate(int[] array, int position) {
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(array));
        
        int temp;

        for (int i = 0; i < position; i++) {
            temp = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = temp;
        }
        System.out.println("Input Array After Rotation");
        System.out.println(Arrays.toString(array));
    }
}

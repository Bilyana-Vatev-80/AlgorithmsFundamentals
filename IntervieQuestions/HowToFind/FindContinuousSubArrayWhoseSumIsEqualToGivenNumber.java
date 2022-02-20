package IntervieQuestions.HowToFind;

import java.util.Arrays;

public class FindContinuousSubArrayWhoseSumIsEqualToGivenNumber {
    public static void main(String[] args) {
        /*
        You have given an integer array and a number.
        You need to find the continuous sub array of the given array whose sum is equal to given number.
        For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you
        have to find continuous sub array in this array such that whose elements add up to 45. In this case,
        {5, 31, 9} is such sub array whose elements add up to 45.
         */
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }

    private static void findSubArray(int[] array, int number) {
        int sum = array[0];
        int start = 0;

        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];

            while (sum > number && start < i - 1){
                sum = sum - array[start];

                start++;
            }

            if(sum == number){
                System.out.println("Continuous sub array of "+ Arrays.toString(array)+" whose sum is "+number+" is ");
                for (int j = start; j <= i; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
        }
    }
}

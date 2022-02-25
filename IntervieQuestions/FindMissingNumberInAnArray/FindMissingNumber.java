package IntervieQuestions.FindMissingNumberInAnArray;

import IntervieQuestions.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] testArray = {1, 4, 5, 3, 7, 8, 6};

        System.out.println(sumMissingNumber(testArray, 8));
        System.out.println(xorMissingNumber(testArray, 8));

        int[] testArrayTwo = {4, 3, 1};
        System.out.println(sumMissingNumber(testArrayTwo, 4));
        System.out.println(xorMissingNumber(testArrayTwo, 4));

        int[] testArrayThree = {1,1,3};
        System.out.println(findDuplicate(testArrayThree));

        int[] testArrayFour = {1, 1, 3, 3};
        System.out.println(setMissingNumber(testArrayFour, 5));
    }
    public static int sumMissingNumber(int[] array, int length){
        // this method is not very good for the time
        int result = 0;
        int expectedSum = length * (length + 1)/ 2;
        int actualSum =0;

        for (int i : array) {
            actualSum += i;
        }

        result = expectedSum - actualSum;

        return result;
    }
    public static int xorMissingNumber(int[] array, int length){
        int result = 0;

        int rangeXor = 0;
        int actualXor = 0;

        for (int i = 0; i < length + 1; i++) {
            rangeXor = result ^ i;
        }

        for (int i : array) {
            actualXor = actualXor ^ i;
        }

        result = rangeXor ^ actualXor;
        return result;
    }
    public static int findDuplicate(int[] array){
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]){
                return array[i];
            }
        }

        return -9999;
    }
    public static Pair setMissingNumber(int[] array, int length){
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> missingNumber = new ArrayList<>();
        List<Integer> copyOfArray = new ArrayList<>();

        for (int i : array) {
            if(copyOfArray.contains(i)){
                if(!duplicates.contains(i)){
                    duplicates.add(i);
                }
            } else {
                copyOfArray.add(i);
            }
        }

        for (int i = 1; i < length + 1; i++) {
            if(!copyOfArray.contains(i)){
                missingNumber.add(i);
            }
        }

        return new Pair(duplicates, missingNumber);
    }


}

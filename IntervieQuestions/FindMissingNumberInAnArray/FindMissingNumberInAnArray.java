package IntervieQuestions.FindMissingNumberInAnArray;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        /*
        If ‘n‘ is the positive number and ‘a‘ is an array
         of integers of length n-1 containing elements from 1 to n.
         Then find the missing number in ‘a’ in the range from 1 to n.
         Occurrence of each element is only once. If n = 8, then array ‘a’ will
         have 7 elements in the range from 1 to 8.
         For example {1, 4, 5, 3, 7, 8, 6}.
         One number will be missing in ‘a’ (2 in this case).
         You have to find out that missing number.
         */

        int n = 8;

        int[] a = {-2, 10, 4};

        int sumOfNumbers = sumOfNumbers(n);

        int sumOfElements = sumOfElements(a);

        int sumOfMissingNumber = sumOfNumbers - sumOfElements;

        System.out.println("missing number is: " + sumOfMissingNumber);
    }

    private static int sumOfElements(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    private static int sumOfNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}

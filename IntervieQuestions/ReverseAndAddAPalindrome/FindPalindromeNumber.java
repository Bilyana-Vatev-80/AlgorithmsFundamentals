package IntervieQuestions.ReverseAndAddAPalindrome;

import java.util.Scanner;

public class FindPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = Integer.parseInt(scanner.nextLine());

        int remainder, sum = 0, temp;

        temp = number;

        while (number != 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }

        if(temp == sum){
            System.out.println("Palindrome number is: " + temp);
        } else {
            System.out.println("Not palindrome");
        }

//        findPalindrome(number);
//        checkPalindrome(number);
//
//        System.out.println(checkPalindrome(number));
    }

//    private static boolean checkPalindrome(int number) {
//        int reverse = findPalindrome(number);
//        if(reverse == number){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private static int findPalindrome(int number) {
//        int reverse = 0;
//        int rem = 0;
//
//        while (number != 0){
//            rem = number % 10;
//            reverse = (reverse * 10) + rem;
//            number = number/10;
//        }
//        return reverse;
//    }
}

package IntervieQuestions.ReverseAndAddAPalindrome;

import java.util.Scanner;

public class ReverseAndAddANumberInPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");

        int inputNumber = Integer.parseInt(scanner.nextLine());

        reversAndAdd(inputNumber);
    }

    //Method To Reverse And Add Given Number Until You Get A Palindrome
    private static void reversAndAdd(int number) {
        if(checkPalindrome(number)){
            System.out.println("Given Number is already a palindrome");
        } else {
            while (!checkPalindrome(number)){
                int reverse = reversNumber(number);
                int sum = number + reverse;
                System.out.println(number+" + "+reverse+" = "+sum);
                number = sum;
            }
        }
    }

    //Method reverse a number
    private static int reversNumber(int number) {
        int reverse = 0;

        int remember = 0;

        while (number != 0){
            remember = number % 10;
            reverse = (reverse * 10) + remember;
            number = number/10;
        }

        return reverse;
    }

    //Method To Check For Palindrome
    public static boolean checkPalindrome(int number){
        int reverse = reversNumber(number);

        if(reverse == number){
            return true;
        } else {
            return false;
        }
    }
}

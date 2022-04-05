package IntervieQuestions.PalindromeProgramsInJava;

import java.util.Scanner;

public class PalindromeProgramIterativeMethod {
    public static void main(String[] args) {
        /*
        In this method, we simultaneously iterate the given string
        from both the ends and check the characters for equality.
        If the characters are same, returns true.
        If the characters are not same, returns false.
         */

        System.out.println("Enter the input String...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(isItPalindrome(input)){
            System.out.println(input + "is a palindrome");
        } else {
            System.out.println(input + "is not a palindrome");
        }
    }

    private static boolean isItPalindrome(String input) {
        //Clean inputString by removing spaces and negating the case of the letters
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        //Convert cleanInputString to char array
        char[] charArray = cleanInput.toCharArray();

        //Let forward index point at first character
        int forward = 0;

        //And backward index point at last character
        int backward = charArray.length - 1;

        //start iterating charArray from both ends simultaneously
        while (forward <= backward){
            if(charArray[forward] != charArray[backward]){
                return false;
            }

            forward++;
            backward--;
        }
        return true;
    }
}

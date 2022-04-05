package IntervieQuestions.PalindromeProgramsInJava;

import java.util.Scanner;

public class PalindromeProgramRecursiveMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input String....");
        String input = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());
        String inputString = String.valueOf(x);

        String cleanInput = input.replaceAll("\\s+", "");
        if(isPalindrome(input)){
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    private static boolean isPalindrome(String input) {
        //If inputString has only one or zero char, return true

        if(input.length() < 2){
            return true;
        } else {
            //Check both ends of inputString for equality
        }
        return false;
    }
}

package IntervieQuestions.FindSumOfAllDigits;

import java.util.Scanner;

public class FindTheSumOfAllDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number != 0){

            //Getting last digit of the input number
            int lastDigits = number % 10;

            //Adding last digit to sum
            sum = sum + lastDigits;

            //Removing last digit from the input number

            number = number / 10;


        }

        System.out.println("Sum of all digits " + sum);
    }
}

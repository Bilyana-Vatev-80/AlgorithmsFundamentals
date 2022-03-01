package IntervieQuestions.HowToCheckIfNumberBelongsToFibonacciSeriesOrNot;

import java.util.Scanner;

public class CheckIfNumberBelongsToFibonacciSeriesOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number:");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        // initialize firstTerm = 0, secondTerm = 1 and thirdTerm = 0 where firstTerm
        // and secondTerm are the first two numbers of the series.
        int firstTerm =0;
        int secondTerm =1;
        int thirdTerm =0;

        //Run the while loop which generates
        // Fibonacci numbers until they are less than inputNumber.

        while (thirdTerm < inputNumber){
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        if(thirdTerm == inputNumber){
            System.out.println("Number belongs to Fibonacci series");
        } else {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }


    }
}

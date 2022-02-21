package IntervieQuestions.PrimeNumber;

import java.util.Scanner;

public class FindOutAllPrimeNumbersBetweenTwoGivenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start value :");

        int start = scanner.nextInt();

        System.out.println("Enter the end value :");

        int end = scanner.nextInt();

        System.out.println("Prime numbers between "+start+" and "+end+" : ");

        for (int i = start; i < end; i++) {
            if (checkForPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkForPrime(int number) {
        boolean isItPrime = true;

        if(number <= 1){
            isItPrime = false;
            return false;
        } else {
            for (int i = 2; i < number / 2; i++) {
                if((number % i) == 0){
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }
}

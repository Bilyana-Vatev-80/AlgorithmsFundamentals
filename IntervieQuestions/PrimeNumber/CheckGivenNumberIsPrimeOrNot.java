package IntervieQuestions.PrimeNumber;

import java.util.Scanner;

public class CheckGivenNumberIsPrimeOrNot {
    public static void main(String[] args) {
        /*
        Prime number is a whole number which is greater than 1 and is
        divisible only by 1 and itself. In the other words,
        prime number has only two factors, 1 and itself.

         Example : 2, 3, 5, 7, 11, 13, 17……

        Note : 0 and 1 are not prime numbers.
         */
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isItPrime = checkForPrime(number);

        if(isItPrime){

            System.out.println(number+" is a prime number.");
        } else {

            System.out.println(number+" is not a prime number.");
        }
    }

    private static boolean checkForPrime(int number) {

        boolean isItPrime = true;

        if(number <= 1){
            isItPrime = false;
            return false;
        } else {
            for (int i = 2; i <= number/2; i++) {
                if((number % i) == 0){
                    isItPrime = false;
                    break;
                }
            }
        }
        return isItPrime;
    }
}

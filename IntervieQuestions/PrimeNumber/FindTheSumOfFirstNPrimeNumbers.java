package IntervieQuestions.PrimeNumber;

import java.util.Scanner;

public class FindTheSumOfFirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for n :");

        int n = scanner.nextInt();
        int counter = 1;
        int sum = 0;

        System.out.println("The sum of first "+n+" Prime Numbers :");

        int inputNumber = 2;

        while (counter <= n){
            if(checkForPrime(inputNumber)){
                System.out.println(inputNumber);
                sum += inputNumber;
                counter++;
            }
            inputNumber++;
        }

        System.out.println("=======");
        System.out.println("Sum: " + sum);
    }

    private static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if(inputNumber <= 1){
            isItPrime = false;

        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if((inputNumber % i) == 0){
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }
}

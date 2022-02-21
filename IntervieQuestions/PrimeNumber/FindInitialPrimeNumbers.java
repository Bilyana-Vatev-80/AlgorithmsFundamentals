package IntervieQuestions.PrimeNumber;

import java.util.Scanner;

public class FindInitialPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many initial prime numbers you want?");
        int number = scanner.nextInt();
        int counter = 1;
        int inputNumber = 2;
        System.out.println("Initial "+number+" Prime Numbers :");

        while (counter <= number){
            if(checkForPrimeNumber(inputNumber)){
                System.out.println(inputNumber);
                counter++;
                inputNumber++;
            } else {
                inputNumber++;
            }
        }
    }

    private static boolean checkForPrimeNumber(int inputNumber) {
        boolean isItPrime = true;

        if(inputNumber <= 1){
            isItPrime = false;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if((inputNumber % i) == 0){
                    isItPrime = false;
                    break;
                }
            }
        }
        return isItPrime;
    }
}

package IntervieQuestions.PrimeNumber;

import java.util.Scanner;

public class Find10nPrimeNumbersAfter100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many prime numbers you want?");

        int n = sc.nextInt();

        System.out.println("After which number?");

        int start = sc.nextInt();

        int counter = 1;

        System.out.println("First "+n+" Prime Numbers after "+start+" :");
        int inputNumber = start + 1;

        while (counter <= n){
            if(checkForPrime(inputNumber)){
                System.out.println(inputNumber);
                counter++;
            }
            inputNumber++;
        }
    }

    private static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if(inputNumber <= 1){
            isItPrime = false;
            return false;
        } else {
            for (int i = 2; i < inputNumber / 2; i++) {
                if((inputNumber % i) == 0){
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }
}

package Recursion;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        long result = calculateFactorial(number);
        System.out.println(result);
    }

    private static long calculateFactorial(int n) {
        if(n == 1){
            return 1;
        }
       return n * calculateFactorial(n - 1);
    }
}

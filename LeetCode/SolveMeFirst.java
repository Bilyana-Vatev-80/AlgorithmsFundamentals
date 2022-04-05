package LeetCode;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        solveMeFirst(a, b);
    }

    private static void solveMeFirst(int a, int b) {
        int sum = 0;

        sum = a + b;

        System.out.println(sum);
    }
}

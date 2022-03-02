package IntervieQuestions.HowToWriteFloydTriangle;

import java.util.Scanner;

public class JavaProgramToPrintFloydTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows you want in Floyd's Triangle?");

        int numberRows = scanner.nextInt();
        int value = 1;

        System.out.println("Floyd's Triangle : ");

        for (int i = 1; i <= numberRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}

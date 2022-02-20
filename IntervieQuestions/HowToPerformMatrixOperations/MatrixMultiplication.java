package IntervieQuestions.HowToPerformMatrixOperations;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows In First Matrix");

        int rowInFirst = scanner.nextInt();

        System.out.println("Enter The Number Of Columns In First Matrix / Rows In Second Matrix");

        int colsInFirstRowsInSecond = scanner.nextInt();

        System.out.println("Enter The Number Of Columns In Second Matrix");

        int colsInSecond = scanner.nextInt();

        int[][] matrix1 = new int[rowInFirst][colsInFirstRowsInSecond];
        int[][] matrix2 = new int[colsInFirstRowsInSecond][colsInSecond];
        int[][] product = new int[rowInFirst][colsInSecond];

        System.out.println("Enter The Data For First Matrix :");
        for (int i = 0; i < rowInFirst; i++) {
            for (int j = 0; j < colsInFirstRowsInSecond; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter The Data For Second Matrix :");
        for (int i = 0; i < colsInFirstRowsInSecond; i++) {
            for (int j = 0; j < colsInSecond; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First Matrix = ");
        for (int i = 0; i < rowInFirst; i++) {
            for (int j = 0; j < colsInFirstRowsInSecond; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix = ");
        for (int i = 0; i < colsInFirstRowsInSecond; i++) {
            for (int j = 0; j < colsInSecond; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Product = ");
        for (int i = 0; i < rowInFirst; i++) {
            for (int j = 0; j < colsInSecond; j++) {
                for (int k = 0; k < colsInFirstRowsInSecond; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < rowInFirst; i++) {
            for (int j = 0; j < colsInSecond; j++) {
                System.out.print(product[i][j] + " ");
            }

            System.out.println();
        }
    }
}

package IntervieQuestions.HowToPerformMatrixOperations;

import java.util.Scanner;

public class MatrixAdding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows");

        int row = scanner.nextInt();

        System.out.println("Enter The Number Of Columns");

        int cols = scanner.nextInt();

        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row][cols];
        int[][] sum = new int[row][cols];

        System.out.println("Enter The Data For First Matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter The Data For Second Matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First Matrix = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }
    }
}

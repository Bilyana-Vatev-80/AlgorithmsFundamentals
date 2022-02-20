package IntervieQuestions.HowToPerformMatrixOperations;

import java.util.Scanner;

public class CreationOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of rows: ");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter The Number of cols: ");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[row][col];
        System.out.println("Enter Matrix Data: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}

package Session5;

import java.util.Random;
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int rowCreation = 5;
        int columnCreation = 5;
        int[][] matrix = new int[rowCreation][columnCreation];
        for (int row = 0; row < rowCreation; row++) {
            for (int column = 0; column < columnCreation; column++) {
                matrix[row][column] = r.nextInt(20);
            }
        }

        // Print the matrix
        for (int row = 0; row < rowCreation; row++) {
            for (int column = 0; column < columnCreation; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        // Find the number in the matrix and replace it with -10
        outerLoop:
        for (int row = 0; row < rowCreation; row++) {
            for (int column = 0; column < columnCreation; column++) {
                if (matrix[row][column] == num) {
                    matrix[row][column] = -10;
                    break outerLoop;
                } else {
                    System.out.println("Number not found.");
                }
            }
        }
        // Print the updated matrix
        System.out.println("Updated matrix:");
        for (int row = 0; row < rowCreation; row++) {
            for (int column = 0; columnCreation < columnCreation; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
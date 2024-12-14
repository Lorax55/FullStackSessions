package Session4;

import java.util.Scanner;

public class DiamondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        do {
            System.out.println("Please enter a positive number of rows for the diamond:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next();
            }
            rows = scanner.nextInt();
        } while (rows <= 0);

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
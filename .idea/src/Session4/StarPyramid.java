package Session4;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Please enter a positive number of rows for the pyramid:");


        // Prompt the user to enter the number of rows for the pyramid
        do {
            System.out.println("Please enter a positive number of rows for the pyramid:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next(); // Clear the invalid input
            }
            rows = scanner.nextInt();
        } while (rows <= 0);

        // Create the pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }

        scanner.close();
    }
}
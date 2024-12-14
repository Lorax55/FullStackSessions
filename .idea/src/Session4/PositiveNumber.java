package Session4;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        // input a positive number
        // create a pyramid based on the positive number
        // pyramid should be in "+"

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a positive number:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive number");
            } else {
                for (int j = 1; j <= number; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }
            }

        }
    }}
package Session4;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {

            if (number < 0) {
                System.out.println("Please enter a positive number");
            } else {
                System.out.println("Thank you for entering a positive number " + number);
            }

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();
        } while (number <= 0);

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
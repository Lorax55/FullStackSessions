package Session5;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Correctly initialize the Scanner object
        System.out.println("Enter the number to search for: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int[] numbers = {10, 20, 30, 40, 50};
            boolean found = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == num) {
                    found = true;
                    System.out.println("Number found: " + num);
                    break;
                }
            }
            if (!found) {
                System.out.println("Number not found.");
            }
        } else {
            System.out.println("Invalid input.");
        }

//        int[] num = {10, 20, 30, 40, 50};
//        int[] reversed = new int[num.length];
//
//        for (int i = 0; i < num.length; i++) {
//            reversed[i] = num[num.length - 1 - i];
//        }
//
//        for (int i = 0; i < reversed.length; i++) {
//            System.out.println(reversed[i]);
//        }
    }
}
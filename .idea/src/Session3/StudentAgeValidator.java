package Session3;

import java.util.Scanner;

public class StudentAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Your Number:");
            int age = scanner.nextInt();
            if (age >= 0 && age <= 100) {
                System.out.println("Valid Age");
                break;
            } else {
                System.out.println("Invalid Age");
            }

        }
    }
}
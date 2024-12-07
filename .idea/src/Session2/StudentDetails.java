package Session2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Student identifier
        // Student first name
        // Student last name
        // Student age

        // Student identifier

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student identifier: ");
        int studentId = scanner.nextInt();
        System.out.println("Enter student first name: ");
        String firstName = scanner.next();
        System.out.println("Enter student last name: ");
        String lastName = scanner.next();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        System.out.println("\n ===== Student details =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("====== Student Detilas ======");
        scanner.close();


    }
}

package Session9;

import java.util.Scanner;

class Student2 {
    int id;
    String firstName;
    String lastName;
    int age;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student identifier: ");
        id = scanner.nextInt();
        System.out.println("Enter student first name: ");
        firstName = scanner.next();
        System.out.println("Enter student last name: ");
        lastName = scanner.next();
        System.out.println("Enter student age: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public void displayStudent() {
        System.out.println("\n ===== Student details =====");
        System.out.println("Student ID: " + id);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("====== Student Detilas =====");
    }
}

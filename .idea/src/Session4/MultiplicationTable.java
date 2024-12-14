package Session4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        scanner.nextInt();
        int id = 0;
        System.out.println("Enter your ID: ");
        int studentid = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(id + " * " + i + " = " + (id * i));
        }
    }
}
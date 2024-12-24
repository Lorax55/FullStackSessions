package Session9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter a number 2: ");
        int num2 = scanner.nextInt();
        int result = num / num2;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Division is not allowed by zero");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number");
    } finally {
        System.out.println("Application Completed");
        scanner.close();
    }
    }
}

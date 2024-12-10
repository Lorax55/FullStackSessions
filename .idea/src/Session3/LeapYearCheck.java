package Session3;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        System.out.println("Leap Year Check");

        // year divisible by 4 is a leap year
        // year divisible by 100 is not a leap year
        // year divisible by 400 is a leap year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}

package Session3;

import java.util.Scanner;

public class IfSample {
    public static void main(String[] args) {
        System.out.println("If Statement example");

        // score 90 or above grade A
        // score 80 to 89 grade B
        // score 70 to 79 grade C
        // score 60 to 69 grade D
        // score 59 or below grade F
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();

        //int score = 75;


        if (score >= 90) {
            System.out.println("Grade A");
        }
        else if (score >= 80) {
            System.out.println("Grade B");
        }
        else if (score >= 70) {
            System.out.println("Grade C");
        }
        else if (score >= 60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }
        scanner.close();
    }
    }

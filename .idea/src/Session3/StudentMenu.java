package Session3;

import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studemtID = 0;
        String FirstName= "";
        String LastMame= "";
        int age= 0;
        while (true) {
            System.out.println("====== Student Menu ======");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Dispay Student Details");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice: ");

            int choice = scanner.nextInt();
                switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter First Name: ");
                    FirstName = scanner.nextLine();
                    //LastMame = scanner.nextLine();

                    System.out.println("Enter Last Name: ");
                    String LastName = scanner.nextLine();

                    System.out.println("Enter Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Information saved successfully.");
                        break;
                    case 2:
                        System.out.println("Student Details: ");
                        System.out.println("Student ID: " + studemtID);
                        System.out.println("First Name: " + FirstName);
                        System.out.println("Last Name: "+ LastMame);
                        System.out.println("Age: " + age);
                        System.out.println("====== End of Student Details ======");
                        break;
                    case 3:
                     scanner.close();
                     System.exit(0);
                        break;
                    default:
        }
    }
    }
    }
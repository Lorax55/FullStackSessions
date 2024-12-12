package Session3;

import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentID = 0;
        String FirstName = "";
        String LastName = "";
        String Choice = "";
        int age = 0;

        while (true) {
            System.out.println("====== Student Menu ======");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Dispay Student Details");
            System.out.println("3. Reset Student Data");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");

                        while (!scanner.hasNextInt() || (studentID = scanner.nextInt()) <= 0) {
                            System.out.println("Invalid Student ID. Please try again.");
                            System.out.println("Enter Student ID: ");
                            studentID = scanner.nextInt();

                        }
                            scanner.nextLine();
                    System.out.println("Enter First Name: ");
                    FirstName = scanner.nextLine();
                        while (FirstName.isEmpty()) {
                            System.out.println("Invalid First Name. Please try again.");
                            System.out.println("Enter First Name: ");
                            FirstName = scanner.nextLine();
                        }

                    System.out.println("Enter Last Name: ");
                    LastName = scanner.nextLine();
                        while (LastName.isEmpty()) {
                            System.out.println("Invalid Last Name. Please try again.");
                            System.out.println("Enter Last Name: ");
                            LastName = scanner.nextLine();
                        }
                    System.out.println("Enter Age: ");
                    age = scanner.nextInt();
                        while (age < 0 || age > 100) {
                            System.out.println("Invalid Age. Please try again.");
                            System.out.println("Enter Age: ");
                            age = scanner.nextInt();
                        }

                    scanner.nextLine();
                    System.out.println("Information saved successfully.");
                    break;
                case 2:
                    if (studentID == 0) {
                        System.out.println("No student data found.");
                        break;
                    } else {
                        System.out.println("Student Details: ");
                        System.out.println("Student ID: " + studentID);
                        System.out.println("First Name: " + FirstName);
                        System.out.println("Last Name: " + LastName);
                        System.out.println("Age: " + age);
                        System.out.println("====== End of Student Details ======");
                    }
                        break;
                        case 3:
                            System.out.println("Reset Student Data");
                            // Type Yes or No if you want to reset Data
                            // If yes, type student ID number to reset
                            // if no, go back to the case menu
                            // if student ID number is correct, reset the data
                            // if student ID number is incorrect, go back to the main menu
                            // if Data is Reset, print "Student data reset successfully." and go back to the main menu
                            System.out.println("Do you want to reset student data? (Yes/No): ");
                            Choice = scanner.nextLine();
                            if (Choice.equalsIgnoreCase("Yes")) {
                                System.out.println("Enter Student ID: ");
                                int studentIDReset = scanner.nextInt();
                                scanner.nextLine(); // Consumes New line
                                if (studentIDReset == studentID) {
                                    studentID = 0;
                                    FirstName = "";
                                    LastName = "";
                                    age = 0;
                                    System.out.println("Student data reset successfully.");


                                } else {
                                    System.out.println("Invalid Student ID. Please try again.");

                                }
                            }
                            break;
                        case 4:
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Choice. Please try again.");
                            break;

                    }
            }
        }
    }

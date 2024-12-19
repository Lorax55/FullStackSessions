package Session6;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.HashSet;

public class StudentManagementPersonalChanges {

    static class Student {
        int studentId;
        String firstName;
        String lastName;
        int studentAge;

        Student(int id, String fName, String lName, int age) {
            this.studentId = id;
            this.firstName = fName;
            this.lastName = lName;
            this.studentAge = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<Student>(); // ArrayList to store student objects
//        HashSet<Integer> studentIds = new HashSet<>(); // HashSet to store student IDs
//        Student[] students = new Student[5]; // Array to store student objects
//        int studentCount = 0; // Counter to keep track of number of students

        //Student student = new Student(0, "", "", 0);

        while (true) { // Infinite loop to display menu
            System.out.println("==== Student Menu ====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student");
            System.out.println("4. Exit");
            System.out.println("5. Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (students.size() >= 5) {
                        System.out.println("Maximum number of students reached.");
                        break;
                    }
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    boolean idExists;
                    do {
                        idExists = false;
                        for (Student s : students) {
                            if (s.studentId == studentId) {
                                idExists = true;
                                System.out.println("Student ID already exists. Please enter a unique student ID: ");
                                studentId = scanner.nextInt();
                                scanner.nextLine();
                                break;
                            }
                        }
                    } while (idExists);

                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();

                    Student student = new Student(studentId, firstName, lastName, studentAge);
                    students.add(student);
                    System.out.println("Information saved successfully.");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student data found.");
                    } else {
                        for (Student s: students) {
                            System.out.println("===== Student Details =====");
                            System.out.println("Student ID: " + s.studentId);
                            System.out.println("First Name: " + s.firstName);
                            System.out.println("Last Name: " + s.lastName);
                            System.out.println("Student Age: " + s.studentAge);
                            System.out.println("===== End of Student Details =====");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (Student s : students) { // Corrected loop
                        if (s.studentId == id) {
                            students.remove(s); // Corrected deletion logic
                            found = true;
                            System.out.println("Student deleted successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student ID not found.");
                    }
                    break;
            case 4:
                scanner.close();
                System.exit(0);
                break;

                default:
                 System.out.println("Invalid choice");
            }
        }
    }
}
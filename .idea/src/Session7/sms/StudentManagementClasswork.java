package Session7.sms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementClasswork {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("===== Student Menu =====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Display student count");
            System.out.println("4. Delete student");
            System.out.println("5. Edit student");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    int studentid = Student.generateStudentId();
                    System.out.println("Your Student ID is: " + studentid);

                    System.out.println("Enter student first name: ");
                    String firstName = scanner.next();

                    System.out.println("Enter student last name: ");
                    String lastName = scanner.next();


                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();
                        while (studentAge < 18 || studentAge > 150) {
                            System.out.println("Invalid age. Please enter a valid age");
                            studentAge = scanner.nextInt();
                        }
                    System.out.println("Enter student major: ");
                    String studentMajor = scanner.next();
                       boolean validMajor = false;
                    while (!validMajor) {
                        if (studentMajor.equalsIgnoreCase("Art") || studentMajor.equalsIgnoreCase("Economics") || studentMajor.equalsIgnoreCase("Math")) {
                            validMajor = true;
                        } else {
                            System.out.println("Invalid major. Please enter a valid major: ");
                            studentMajor = scanner.next();
                        }
                        // (!studentMajor.equalsIgnoreCase("Art") && !studentMajor.equalsIgnoreCase("Economics") && !studentMajor.equalsIgnoreCase("Math")) {
                    //System.out.println("Invalid major. Please enter a valid major: ");
                }

                    Student student = new Student(studentid, firstName, lastName, studentAge, studentMajor);

                    students.add(student);

                    System.out.println("Information saved successfully" + student.toString());
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s%n", "Student ID", "First Name", "Last Name", "Age", "Major");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (Student s : students) {
                        System.out.printf("%-10d %-20s %-20s %-10d %-20s%n",
                                s.getStudentId(),
                                s.getFirstName(),
                                s.getLastName(),
                                s.getStudentAge(),
                                s.getStudentMajor());
                    }
                    System.out.println("-----------------------------------------------------------------------------------------");
                    // add Student Count

//                    System.out.printf("%-10d %-20s %-20s %-10s %-20s%n", "Student ID", "First Name", "Last Name", "Age", "Major");
//                    System.out.println("-----------------------------------------------------------------------------------------");
//                    for (Student s : students) {
//                        System.out.printf("%-10d %-20s %-20s %-10d %-20s%n",
//                                s.studentId,
//                                s.firstName,
//                                s.lastName,
//                                s.studentAge,
//                                s.studentMajor);
//                    System.out.printf("%-10d %-20s %-20s %-5d%n", "Student ID", "Student Name", "Student Last Name", "Student Age", "Student Major");
//                    System.out .println("-----------------------------------------------------------------------------");
//                    for (int i = 0; i < students.size(); i++) {
//                        Student s = students.get(i);
//
//                        System.out.printf("%-10d %-20s %-20s %-5d% %-20s%n",
//                                s.studentId,
//                                s.firstName,
//                                s.lastName,
//                                s.studentAge,
//                                s.studentMajor); //add column names and some seperators to make it look nic

//                        System.out.println("===== Student Details =====");
//                        System.out.println("Student ID: " + s.studentId);
//                        System.out.println("First Name: " + s.firstName);
//                        System.out.println("Last Name: " + s.lastName);
//                        System.out.println("Age: " + s.studentAge);
//                        System.out.println("===== End of Student Details =====");
 //                   }
                    break;
                case 3:
                    System.out.println("Number of students total: " + Student.studentCount);
                    break;
                case 4:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean idExists = false;
                    for (Student s : students) {
                        if (s.studentId == id) {
                            students.remove(s);
                            Student.studentCount--;
                            idExists = true;
                            System.out.println("Student deleted successfully");
                            break;
                        }
                    }
                    if (!idExists) {
                        System.out.println("Student with id " + id + " does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Enter student id to edit: ");
                    int idToEdit = scanner.nextInt();
                    scanner.nextLine();
                    boolean Found = false;
                    for (Student s : students) { // for student searched in students we will start doing certain things
                        if (s.studentId == idToEdit) { //IF STUDENT IF == EDIT
                            System.out.println("Enter new student first name: ");
                            s.firstName = scanner.nextLine(); // student found and print new pobject
                            System.out.println("Enter new student last name: ");
                            s.lastName = scanner.nextLine();
                            System.out.println("Enter new student age: ");
                            s.studentAge = scanner.nextInt();
                            System.out.println("Enter new student major: ");
                            s.studentMajor = scanner.next();

                            System.out.println("Student edited successfully");
                            Found = true;
                        }
                    }
                    if (!Found) {
                        System.out.println("Student with id " + idToEdit + " does not exist");
                    }
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
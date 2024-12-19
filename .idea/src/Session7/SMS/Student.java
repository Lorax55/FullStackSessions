package Session7.SMS;

public class Student {
    int studentId;
    String firstName;
    String lastName;
    int studentAge;

    Student(int id, String fName, String lName, int Age) {
        this.studentId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = Age;
    }
    public String toString() {
        //return this.studentId + " " + this.firstName + " " + this.lastName + " " + this.studentAge;
        return String.format("ID: %d, First Name: %s, Last Name: %s",
                 studentId,
                 firstName,
                 lastName);
    }
}
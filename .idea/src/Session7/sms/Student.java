package Session7.sms;

public class Student {
    int studentId;
    String firstName;
    String lastName;
    int studentAge;
    String studentMajor;

     public Student(int id, String fName, String lName, int Age, String major) {
        this.studentId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = Age;
        this.studentMajor = major;
    }
    @Override
    public String toString() {
        //return this.studentId + " " + this.firstName + " " + this.lastName + " " + this.studentAge;
        return String.format("ID: %d, First Name: %s, Last Name: %s, Age %d, Major: %s",
                 studentId,
                 firstName,
                 lastName,
                 studentAge,
                 studentMajor);
    }
}
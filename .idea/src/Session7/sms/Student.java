package Session7.sms;

public class Student {
    int studentId;
    String firstName;
    String lastName;
    int studentAge;
    String studentMajor;
    static int studentCount = 0;


    public Student(int id, String fName, String lName, int Age, String major) {

        this.studentId = id;
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setStudentAge(Age);
        this.setStudentMajor(major);
        studentCount++;
    }

    public static int generateStudentId() {
        return studentCount + 1;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
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

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class StudentAgeVerifier {
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18 || age > 150) {
                throw new InvalidAgeException("Age must be between 18 and 150");

            }
        }
    }
}
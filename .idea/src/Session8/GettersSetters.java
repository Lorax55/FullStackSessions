package Session8;

public class GettersSetters {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.firstName = "John";
        // p.lastName = "Doe";
        // System.out.println(p.firstName + " " + p.lastName);
        // p.setFirstName("John");
        // System.out.println(p.getFirstName());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            System.out.println("First name cannot be empty");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
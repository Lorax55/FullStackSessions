package Session8;

public class GettersSetters {
    public static void main(String[] args) {
        Person p = new Person();
//        p.firstName = "Artem";
//        p.lastName = "Oganesyan";
//        System.out.println(p.firstName + " " + p.lastName);
        p.setFirstName("");
        System.out.println(p.getFirstName());
    }
}


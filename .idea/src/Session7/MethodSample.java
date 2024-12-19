package Session7;

public class MethodSample {
    public static void main(String[] args) {
        printMessage();
        showGreeting("Vlad");
        String message = getMessage();
    }

    public static void printMessage() {
        System.out.println("Message");
    }

    public static void showGreeting(String name) {
        System.out.println("Hello " + name);
    }

    public static String getMessage() {
        showMessage();
        return "100";
    }

    public static void showMessage() {
        System.out.println("This is a message");
    }
}

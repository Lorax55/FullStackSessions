package Session4;

public class WhileExample {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        while (counter < 0) {
            System.out.println("This is infinite loop");
            Thread.sleep(1000);
            counter++;
        }
    }
}
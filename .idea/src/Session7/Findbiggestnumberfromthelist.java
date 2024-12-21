package Session7;

public class Findbiggestnumberfromthelist {
//find biggest number from list using if statent
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + max);

}}

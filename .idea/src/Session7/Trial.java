package Session7;

public class Trial {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<=50; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }

        System.out.println("The sum of even numbers from 0 to 50 is: " + sum);
        }
    }



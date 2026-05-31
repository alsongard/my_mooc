
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        while (true) {

            System.out.println("Give a number:");
            userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber < 0) {
                System.out.println("Unsuitable number");
                continue; // this moves the execution to the start in the loop
            } else if (userNumber == 0) {
                break;
            } else {
                double result = Math.pow(userNumber, 2);
                System.out.println(result);  
            }
        }
    }
}



import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get sum of input numbers untill 0 entered
        int sum  = 0;
        int userInput = 0;
        while (true) {
            System.out.println("Give a number:");
            // get userinput
            userInput = Integer.valueOf(scanner.nextLine());
            if (userInput != 0 ) { // not equal to zero
                sum = sum + userInput;
            } else if (userInput == 0) {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}


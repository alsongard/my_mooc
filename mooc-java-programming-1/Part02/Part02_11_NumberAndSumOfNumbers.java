
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variable to keep track of user input 
        int numberOfInput = 0;
        // variable for sum
        int sum = 0;

        int userInput = 0;
        while (true) {
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            if (userInput != 0) {
                sum = sum + userInput; 
                numberOfInput = numberOfInput + 1;
            } else if (userInput == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + numberOfInput + "\nSum of the numbers: " + sum);
    }
}


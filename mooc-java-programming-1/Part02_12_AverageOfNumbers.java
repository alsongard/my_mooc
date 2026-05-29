
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get average for all user input values expect 0
        int userNumberCount = 0;
        int userInput = 0;

        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput != 0) { 
                sum = sum + userInput;
                userNumberCount++;
            } else if (userInput == 0) {
                break;
            }
        }
        // get Average
        double average = (double) sum / userNumberCount;
        System.out.println("Average of the numbers: " + average);
    }
}


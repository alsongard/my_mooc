
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get average of positive values only

        int positiveCount = 0;
        int userInput = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput > 0) { // increment userCount, sum , positiveCount
                positiveCount++;
                sum += userInput;
            }

            if (userInput == 0) {
                break;
            } 
        }
        // check if positive values 
        if (positiveCount > 0) {
            double average = (double) sum / positiveCount;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}


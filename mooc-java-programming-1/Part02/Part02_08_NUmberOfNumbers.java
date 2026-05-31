
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // count number of inputs given by user
        // exit if input is zero and prints number of inputs
        int inputCount = 0;
        while (true){
            // get userInput
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            // not equal to 0
            if (userInput != 0) { 
                inputCount = inputCount + 1;
            }

            if (userInput == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + inputCount);

    }
}


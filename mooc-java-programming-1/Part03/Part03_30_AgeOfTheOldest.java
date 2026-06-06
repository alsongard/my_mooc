
import java.util.Scanner;


/*
 * Problem Statement: Write a program that reads names and ages from the user until an empty line is entered.
 * The name and age are separated by a comma. After reading all user input, the program prints the age of the oldest person. 
 * You can assume that the user enters at least one person, and that one of the users is older than the others.
 *
*/


class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestAge = 0;
        
        while (true) {
            String userInput = scanner.nextLine();

            if (!userInput.isEmpty()) {
                String[] textArray = userInput.split(",");
                // get the last part, convert to integer
                int age = Integer.valueOf(textArray[textArray.length - 1]);
                if (age > largestAge) {
                    largestAge = age;
                }
            } else {
                break;
            }

        }

        System.out.println("Age of the oldest: " + largestAge);

    }
}


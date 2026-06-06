
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Problem Statement:  Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma
 *  After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume
 *  that the user enters at least one person.
*/

class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0.0;

        String longestName = "";

        int longestNameLength = 0;

        int sum  = 0;

        int count = 0;

        while (true) {
            String userInput = scanner.nextLine();

            if (!userInput.isEmpty()) {  // if empty is false : userInput contains string
                String[] textArray = userInput.split(",");
                
                if (textArray[0].length() > longestNameLength) {
                    longestNameLength = textArray[0].length(); // reassign longestNameLength
                    longestName = textArray[0];
                }
                // get sum 
                sum += Integer.valueOf(textArray[textArray.length - 1]);
                // increment count
                count++;
            } else {
                break;
            }
        }
        average = (double) sum / count;

        System.out.println("Longest name : " + longestName);
        System.out.println("Average of birth years: " + average);
    }
}


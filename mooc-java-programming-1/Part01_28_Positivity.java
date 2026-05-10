
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // Write a program that prompts the user for an integer and informs the user whether or // not it is positive (greater than zero).


        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scan.nextLine());

        if (userInput > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }   
    }
}


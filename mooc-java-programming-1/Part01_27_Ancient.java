
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!".

        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scan.nextLine());
        
        if (userInput < 2015) {
            System.out.println("Ancient history!");
        }
    }
}



import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //Write a program that prompts the user for an integer and prints the string "Orwell" if the number is exactly 1984.
        /*
            Give a number:
            input 
        */
        System.out.println("Give a number:");
        int userInt = Integer.valueOf(scan.nextLine());

        if (userInt == 1984) {
            System.out.println("Orwell");
        }
    }
}


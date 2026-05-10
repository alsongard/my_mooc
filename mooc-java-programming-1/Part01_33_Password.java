
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // Write a program that prompts the user for a password. If the password is
        // "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

        System.out.println("Password?");
        String userInput = scan.nextLine();

        if (userInput.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}


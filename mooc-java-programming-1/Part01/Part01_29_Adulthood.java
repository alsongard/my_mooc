
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).

        System.out.println("How old are you?");
        int userInput = Integer.valueOf(scan.nextLine());
        if (userInput >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}


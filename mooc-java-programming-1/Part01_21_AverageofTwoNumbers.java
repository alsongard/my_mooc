
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
            Give the first number:
            8
            Give the second number:
            2
            The average is 5.0
        */

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        // int first = scanner.nextInt();


        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        // int second = scanner.nextInt();


        double averageVal =  ((double) first + second) / 2; 
        System.out.println("The average is " + averageVal);
    } 


}


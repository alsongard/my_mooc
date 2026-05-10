
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /* 
            Give the first number:
            8
            Give the second number:
            2
            Give the third number:
            3
            The average is 4.333333333333333
        */

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        double averageResult = ((double) first + second + third) /3 ;

        System.out.println("The average is " + averageResult);
        
    }
}


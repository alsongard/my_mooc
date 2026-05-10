
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int userValue = Integer.valueOf(scanner.nextLine());

        // convert to seconds
        // 1 hour = 60 minutes  1 minute =  60 secods: 60 * 60 = 3600 seconds in an hour
        // 1 day has 24 hours :: 86400seconds
        int numberSecondsInDay = 86400;
        int results  = numberSecondsInDay * userValue;
        System.out.println(results);

         
    }
}


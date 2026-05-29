
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get factoriall for input value : n = 5 : n! = 1 * 2 * 3 * 4 * 5;
        
        // getuser input
        System.out.println("Give a number: ");
        int userValue = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        for (int i = 1; i <= userValue ; i++) { // the last potion of the for value is executed after the body is executed 
            if (userValue == 0) {
                break;
            }
            fact = i * fact;
        }

        System.out.println("Factorial: " + fact);
    }
}


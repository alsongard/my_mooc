
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter any number: ");
        int userNumber = Integer.valueOf(scanner.nextLine());


        int result = userNumber * userNumber;
        System.out.println(result);
    }
}


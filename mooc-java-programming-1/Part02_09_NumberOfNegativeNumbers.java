
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeValues = 0;
        int userValue = 0;
        while (true) {
            System.out.println("Give a number:");
            userValue = Integer.valueOf(scanner.nextLine());
            if (userValue < 0) {
                negativeValues = negativeValues + 1;
            }

            if (userValue == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + negativeValues);
    }
}


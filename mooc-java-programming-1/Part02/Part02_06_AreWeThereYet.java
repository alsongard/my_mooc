
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;
        while (true) {
            System.out.println("Give a number:");
            userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 4) {
                break;
            }
        }
    }
}


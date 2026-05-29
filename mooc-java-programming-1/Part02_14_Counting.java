
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get user input
        int userInt = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= userInt ; i++) {
            System.out.println(i);
        }
    }
}


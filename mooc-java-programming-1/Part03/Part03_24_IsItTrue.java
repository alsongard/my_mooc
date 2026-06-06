
import java.util.Scanner;

class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equals("true"))  {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}


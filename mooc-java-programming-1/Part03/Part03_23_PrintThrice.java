
import java.util.Scanner;

class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String userInput = scanner.nextLine();
        int i = 1;
        while(i < 4) {
            System.out.print(userInput);
            i++;
        }
    }
}


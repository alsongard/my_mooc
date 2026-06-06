
import java.util.Scanner;
/*
 * Problem Statement: get userinput, if input is empty halt program, otherwise split the userInput and print the first word in the given string
*/


class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (!userInput.isEmpty()) {
                String[] userTextArray = userInput.split(" ");
                System.out.println(userTextArray[0]);
            } else {
                break;
            }
        }
    }
}



import java.util.Scanner;

/*
 * Problem Statement: get input from user for each input split the string into an array check if string contains av string if true print
 *
*/
class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (!userInput.isEmpty()) { // not empty : split and check if contains av : if true print
                String[] userTextArray = userInput.split(" ");

                for(String word: userTextArray) {

                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }

            }
            else {
                break;
            }
        }
    }
}


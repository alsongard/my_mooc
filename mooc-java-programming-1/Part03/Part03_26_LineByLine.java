
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.nextLine();
            if (!userInput.isEmpty()) { // not empty assign to userText
                String[] userArray = userInput.split(" ");
                for (String word: userArray) {
                    System.out.println(word);
                }
            }
            else {
                break;
            }

        }
        // // split text
        // System.out.println("userText");
        // System.out.println(userText);
        
        // String[] textArray = userText.split(" ");
        // for (int i = 0; i < textArray.length; i++) {
        //     System.out.println(textArray[i]);
        // }
    }
}


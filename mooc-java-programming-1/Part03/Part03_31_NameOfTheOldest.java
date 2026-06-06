
import java.util.Scanner;

// print the name of the oldest person
public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestAge = 0;
        String username  = "";

        while (true) {
            // get user input
            String userText = scanner.nextLine();
            if (!userText.isEmpty()) { // not empty
                String[] textArray = userText.split(","); // split string
                // access the last part of the array
                int age = Integer.valueOf(textArray[textArray.length - 1]);

                if (age > largestAge) {
                    largestAge = age;
                    username = textArray[0];
                }
            }
            else {
                break;
            }
        }

        System.out.println("Name of the oldest: " + username);

    }
}


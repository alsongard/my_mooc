
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Modify the program to print the third item in the list
 * ["Jupiter" , "Mars", "Hello"] 
 * output: Hello
 *
*/

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
    }
}


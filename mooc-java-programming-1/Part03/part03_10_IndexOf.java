
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine()); 
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        // ask user for a number and return it's index 
        System.out.println("Search for?");
        int userInput  =  Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i <= list.size() -1 ; i++) {
            if (userInput == list.get(i)) {
                System.out.println(userInput + " is at index " + i);
            }
        }

    }
}



import java.util.ArrayList;
import java.util.Scanner;

class OnTheList {

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

        // search for a string in list
        System.out.println("Search for?");
        String userInput = scanner.nextLine();

        boolean found = list.contains(userInput);
        
        if (found) {
            System.out.println(userInput + " was found!");
        } else {
            System.out.println(userInput + " not found!");
        }


    }
}


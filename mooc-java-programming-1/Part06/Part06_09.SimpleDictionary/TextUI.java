import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary simpleDictionary;
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scan = scanner;
        this.simpleDictionary = dict;
    }


    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scan.nextLine();

                System.out.println("Translation:");
                String translation = this.scan.nextLine();
                this.simpleDictionary.add(word, translation);
            }

            if (command.equals("search")) {
                System.out.println("To be translated");
                String searchWord  = this.scan.nextLine();
                String foundTranslation = this.simpleDictionary.translate(searchWord); // Return of String
                if (foundTranslation != null) {
                    System.out.println("Translation:" + foundTranslation);
                } else {
                    System.out.println("Word " + searchWord + " was not found.");
                }
            }
            System.out.println("Unknown command");
        }

    }
}


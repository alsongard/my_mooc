import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    // constructor
    public UserInterface(JokeManager thejoke, Scanner givenScan) {
        this.scanner = givenScan;
        this.jokeManager = thejoke;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();

                this.jokeManager.addJoke(joke);
                
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());
            } else if (command.equals("3")) {
                this.jokeManager.printJokes();
            }
        }
    } 
}


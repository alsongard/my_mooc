import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birdList;


    // constructor
    public UserInterface(Scanner scan) {
        this.scanner = scan;
        this.birdList = new ArrayList<>();
    }

    public void start() {
        while(true){
            System.out.println("Add - adds a bird\nObservation - adds an observation\nAll - prints all birds\nOne - prints one bird\nQuit - ends the program\n");
            System.out.println("?");
            String command = this.scanner.nextLine();
            if (command.equals("Quit")){
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String birdName  = this.scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                birdList.add(new Bird(birdName, latinName));
                System.out.println();
                continue;
            } else if (command.equals("Observation")){
                System.out.println("Bird? ");
                String givenBirdName = this.scanner.nextLine();
                int count = 0;
                for (Bird item : this.birdList) {
                    if (item.getBirdName().equals(givenBirdName)) {
                        item.addObservation();
                        count++; // bird does exist
                    }
                } 
                if (count == 0) {
                    System.out.println("Not a bird");
                }
                System.out.println();
            } else if (command.equals("All")) {
                for (Bird item: this.birdList) {
                    System.out.println(item);
                }
                System.out.println();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String birdInput = this.scanner.nextLine();
                for (Bird item: this.birdList) {
                    if (item.getBirdName().equals(birdInput)) {
                        System.out.println(item);
                    }
                }
                System.out.println();
            }

        }
    }
}



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> myArchives = new ArrayList<>();


        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive newArchive = new Archive(identifier, name);

            if (myArchives.contains(newArchive)) {
                continue; // go to the top 
            }
            myArchives.add(newArchive);
        }
        
        System.out.println("==items==");
        for (Archive archiveItem: myArchives) {
            System.out.println(archiveItem);
        }
    }
}


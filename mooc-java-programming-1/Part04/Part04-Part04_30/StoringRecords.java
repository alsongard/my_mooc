
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) { // the return type for the function is an ArrayList of type Persons
        ArrayList<Person> persons = new ArrayList<>(); 


        // Write here the code for reading from file   
        try (Scanner fileReader = new Scanner(Paths.get(file))) {        
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                // split
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf( parts[parts.length - 1]);
                // String uniqueName = name + "peson";
                // Person  uniqueName = new Person(name, age); / not impossible with this learn on how to use map
                Person newPerson = new Person(name, age);
                persons.add(newPerson);

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error " + e.getMessage());
        }
        // and printing the read records
        return persons;

    }
}


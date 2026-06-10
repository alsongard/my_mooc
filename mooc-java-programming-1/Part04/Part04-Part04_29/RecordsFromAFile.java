
import java.nio.file.Paths;
import java.util.Scanner;

class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // get file name from user
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();

                String[] parts = row.split(",");

                String name = parts[0];
                int age = Integer.valueOf(parts[parts.length - 1]);
                String year = "year";
                if (age > 1 || age == 0) {
                    year = "years";
                }
                System.out.println(name + ", " + "age: " + age + " " +  year);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }




    }
}


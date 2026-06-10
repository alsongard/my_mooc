
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // read from the file
        ArrayList<Integer> myList = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                myList.add(Integer.valueOf(fileReader.nextLine()));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        //iterate list to find number
        int count = 0;
        for (int num : myList) {
            if (num >= lowerBound && num <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}


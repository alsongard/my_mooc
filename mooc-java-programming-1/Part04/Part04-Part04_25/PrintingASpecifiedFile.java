/*
 * Problem Statment: print any file that equals to the string provied by the user
 *
*/


import java.nio.file.Paths;
import java.util.Scanner;

class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input check if file exit then print
        System.out.println("Which file should have its contents printed?");
        String userInput = scanner.nextLine();

        
        try (Scanner fileReader = new Scanner(Paths.get(userInput))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                System.out.println(row);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}


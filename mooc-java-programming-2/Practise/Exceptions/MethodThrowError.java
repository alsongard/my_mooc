import java.util.Scanner;
import  java.util.ArrayList;
import  java.util.List;
import java.nio.file.Paths;
import java.nio.file.Files;

class MethodThrowError {
    public static void main() {
        // in the main method to handle the below error we can  either use:
        // - try catch block or throw Exception which gets handled by the JVM (java virtual machine)
        try {
            List<String> myStrings = readLines("./data/files.txt");
            System.out.println("This is myStrings");
            System.out.println(myStrings);
        } catch   (Exception err) {
            System.out.println("Error occured: " + err.getMessage());
        }
    }
    public static ArrayList<String> readLines (String filepath) throws  Exception {
        ArrayList<String> myLines = new ArrayList<>();
//        Scanner scan = new Scanner(Paths.get(filepath)));
//        while (scan.hasNextLine()) {
//            myLines.add(scan.nextLine());
//        }
        // use streams
         Files.lines(Paths.get(filepath)).forEach(line -> myLines.add(line));

        return myLines;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;


class ResourcesExceptionHandling {
    public static void main(String args[]) {
        String filename = "./data/files.txt";
        ArrayList<String> lines = new ArrayList<>();
        try  (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
        } catch(Exception e) {
            System.out.println("The program encounted an  error while reading the file:");
            System.out.println(e.getMessage());
        }

        for (String line: lines) {
            System.out.println(line);
        }
    }
}
import java.io.FileWriter;
import java.io.PrintWriter;
class PrintWriterToFiles {
    public static  void main() {
        try {

            PrintWriter writeToFile =  new PrintWriter(new FileWriter("./data/file.txt"), true);
            writeToFile.println("Hello World today is monday");
            writeToFile.println("More text");
            writeToFile.print("Are you single ?");
            writeToFile.println("Why don't you ask your dad");
        } catch (Exception e) {
            System.out.println("Error occured while accessing file for write: "+ e.getMessage());
        }
    }

}

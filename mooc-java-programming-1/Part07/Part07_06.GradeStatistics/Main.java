
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Statistics userStats = new Statistics();
        UserInterface uiInterface = new UserInterface(scanner, userStats);

        uiInterface.Start();

        System.out.println("Point average (all): " + uiInterface.getAverage());
        uiInterface.printPassingGrade();

        uiInterface.printPassingPercentage();

        uiInterface.printGradeDistribution();
    }  
}


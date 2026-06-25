import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Statistics statistics;
    // constructor 
    public UserInterface(Scanner scan, Statistics stats) {
        this.scanner = scan;
        this.statistics = stats;
    }


    public void Start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            this.statistics.addValue(userInput);

        }
    }


    public double getAverage() {
        return this.statistics.returnAverage();
    }

    public void printPassingGrade(){
        String message = "";
        double value = this.statistics.getPassingGradeAverage();
        if (value == -0.0) {
            System.out.println("Point average (passing): " + "-");
        } else {
            System.out.println("Point average (passing): " + value);
        }
    }

    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + this.statistics.getPassPercentage());
    }

    public void printGradeDistribution() {
        this.statistics.printStars();
    }
}


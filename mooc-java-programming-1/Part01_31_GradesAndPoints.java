
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int userPoints = Integer.valueOf(scan.nextLine());
        if (userPoints > 100 ) {
            System.out.println("incredible!");
        } else if (userPoints >= 90 && userPoints <= 100) {
            System.out.println("5");
        } else if (userPoints >= 80 && userPoints <= 89) {
            System.out.println("4");
        } else if (userPoints >= 70 && userPoints <= 79) {
            System.out.println("3");
        } else if (userPoints >= 60 && userPoints <= 69) {
            System.out.println("2");
        } else if (userPoints >= 50 && userPoints <= 59) {
            System.out.println("1");
        } else if (userPoints >= 0 && userPoints <= 49) {
            System.out.println("failed");
        } else if (userPoints < 0 ) {
            System.out.println("Impossible");
        }
    }
}


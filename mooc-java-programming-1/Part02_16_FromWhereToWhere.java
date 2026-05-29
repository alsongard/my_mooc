
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int whereTo = Integer.valueOf(scanner.nextLine()); //whereTo
        int whereFrom = Integer.valueOf(scanner.nextLine());
        // System.out.println("Where to? " + whereTo);
        // System.out.println("Where From? " + whereFrom);
        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println("Running in whereTo");
            System.out.println(i);
        }

    }
}


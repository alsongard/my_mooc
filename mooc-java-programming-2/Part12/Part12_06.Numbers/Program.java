
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int genCountNum =  Integer.valueOf(scanner.nextLine());

        Random ladyLuck = new Random();
        int count = 0;
        while(count < genCountNum) {
            int randomNum = ladyLuck.nextInt(11);
            System.out.println(randomNum);
            count++;
        }
    }

}


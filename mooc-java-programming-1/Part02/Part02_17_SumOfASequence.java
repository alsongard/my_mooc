
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get sum of numbers in a given loop

        // get input
        int n = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; 
        }
        System.out.println("Last number? " + n);
        System.out.println("The sum is " + sum);
    }
}


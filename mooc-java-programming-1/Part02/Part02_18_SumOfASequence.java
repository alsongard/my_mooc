
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // get user input
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = firstNumber ; i <= secondNumber; ++i) {
            sum += i;
        }
        System.out.println("First number? " + firstNumber);
        System.out.println("Second number? " + secondNumber);
        System.out.println("The sum is " + sum);

        // int sum = 1;
        // System.out.println(++sum); pre-incremnt : ++sum = 2  || post-increment : sum++ = 1
    }
}


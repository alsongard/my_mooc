
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        

        System.out.println("Enter second number:");

        int secondNumber = Integer.valueOf(scanner.nextLine());

        // get sum
        int sum = firstNumber + secondNumber;
        double result = Math.sqrt(sum);
        System.out.println(result);

    }   
}



import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        
        int userNumber = Integer.valueOf(scanner.nextLine());


        if (userNumber < 0){
            int result = userNumber * -1;
            System.out.println(result);
        } else {
            System.out.println(userNumber);
        }
    }
}


import java.util.Scanner;

class ExceptionExample {
    public static  void main(String args[]) {
        // the below will  be used to  illustrate an  example of exception handling
        Scanner scan = new Scanner(System.in );
        int userInput = -1;
        while (true) {
            try {
                System.out.println("Enter any number: ");
                userInput = Integer.parseInt(scan.nextLine());
                System.out.println("User input is a number");
            } catch (Exception e) {
                System.out.println("User input is not a number: ");
            }
        }

    }
}
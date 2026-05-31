import java.util.ArrayList;
import java.util.Scanner;

class Part03_SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get user input
        // add to array list

        // if input == zero break
        // get sum of second + third item on list
        int userInput = 0;
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true) {
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            }
            numberList.add(userInput);
        }
        int sum = numberList.get(1) + numberList.get(2);
        System.out.println("The sum " + numberList.get(1) + " + "  + numberList.get(2) + " is : ") ;
        System.out.println(sum);
    }
}   

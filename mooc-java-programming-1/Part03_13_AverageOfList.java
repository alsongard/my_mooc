
import java.util.ArrayList;
import java.util.Scanner;

class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> numberList = new ArrayList<>();

        int userInput = 0;
        while (true) {
            userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            numberList.add(userInput);
        }
        // get sum 
        // get averae
        int sum = 0;
        for(int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }

        double average = (double) sum / numberList.size();
        System.out.println("Average: " + average);
    }
}


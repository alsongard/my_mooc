
import java.util.ArrayList;
import java.util.Scanner;

class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        ArrayList<Integer> numbers = new ArrayList<>();

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int userNumber = 0;
        while(true) {
            userNumber = Integer.valueOf(scanner.nextLine());
            if (userNumber == 9999) {
                break;
            }
            numbers.add(userNumber);
        }
        int smallestNumber = 1000;
        int currentIndex = 0;
        for(int i =  0; i <= numbers.size()-1; i++) {
            if (numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
                currentIndex = i;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + currentIndex);


    }
}


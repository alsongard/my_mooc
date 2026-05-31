
import java.util.ArrayList;
import java.util.Scanner;

// print all numbers

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }

        int index = 0;
        while (index <= numbers.size() - 1) {
            int currentNumber = numbers.get(index);
            System.out.println(currentNumber);
            index++;
        }

    }
}



import java.util.ArrayList;
import java.util.Scanner;

class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From Where?");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        int whereTo = numbers.size() - 1;

        while (true) {
            System.out.println("Where to?");
            whereTo = Integer.valueOf(scanner.nextLine());
            if (whereTo <= numbers.size() - 1) {
		System.out.println("WhereTo is large than size of array");
                break;
            }
        }

  

        for (int i = whereFrom; i <= whereTo; i++) {
            int currentNumber = numbers.get(i);
            System.out.println(currentNumber);
        }

    }
}


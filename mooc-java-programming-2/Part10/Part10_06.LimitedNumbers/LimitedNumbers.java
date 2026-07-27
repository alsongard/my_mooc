
import java.util.ArrayList;
import java.util.Scanner;

class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> myArray = new ArrayList<>();

		// stop reading when input is negative number
		while (true) {
			int userInput = Integer.valueOf(scanner.nextLine());
			if (userInput < 0) {
				break;
			}
			myArray.add(userInput);
		}

		myArray.stream()
			.filter(s -> s >= 1 && s <= 5)
			.forEach(s-> System.out.println(s));
    }
}


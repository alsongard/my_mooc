
import java.util.ArrayList;
import java.util.Scanner;
class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		ArrayList<String> myArray = new ArrayList<>(); 
		while (true) {
			String userInput = scanner.nextLine();

			if (userInput.isEmpty()) {
				break;
			}

			myArray.add(userInput);
		}

		myArray.stream()
			.forEach(value -> System.out.println(value + "\n"));
    }
}



import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne


		ArrayList<String> numbers = new ArrayList<>();

		System.out.println("Input numbers, type  \"end\" to stop");

		while(true) {
			String userInput = scanner.nextLine();

			if (userInput.equals("end")) {
				break;
			}

			numbers.add(userInput);
		}

		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
		String answer = scanner.nextLine();


		double average = 0.0;
		String message = "";
		if (answer.equals("n")) { // average of negative numbers
			average = numbers.stream()
				.mapToInt(s -> Integer.valueOf(s))
				.filter(s -> s < 0)
				.average()
				.getAsDouble();

			message = "Average of negative numbers: " + average;
		} else { //average of positive numbers
			average = numbers.stream()
				.mapToInt(s -> Integer.valueOf(s))
				.filter(s -> s > 0)
				.average()
				.getAsDouble();

			message = "Average of positive numbers: " + average;
			
		}

		System.out.println(message);

		
    }
}


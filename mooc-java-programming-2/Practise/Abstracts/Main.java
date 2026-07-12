import java.util.Scanner;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
	
		UserInterface userInterface = new UserInterface(new Scanner(System.in));
		userInterface.addOperation(new PlusOperation());

		userInterface.start();
	}
}

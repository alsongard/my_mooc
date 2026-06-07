/*
 * An introduction to Arrays in java
 * Syntax: int[] numbers = new int[size];
 *
*/
import java.util.Scanner;

class ArrayIntroduction {
	
	public static void main(String[] args) {

		int[] myNumbers = new int[3];
		// to add values to an array we must specify the index
		
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		System.out.println("Enter any number to be added to array of size 3");
	
		for (int i = 0; i <= myNumbers.length-1; i++){
			userInput = Integer.valueOf(scanner.nextLine());
			myNumbers[i] = userInput;
		}
	
		System.out.println(myNumbers[2]);


		String[] planets = {"Earth", "Uranus", "Saturn"};

		int a = 0; 
		while (a < planets.length) {
			System.out.println("Planet" + planets[a]);
			a++;
		}
	}



}

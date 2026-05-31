package Practise;
import java.util.ArrayList;
class ArrayIntroduction { 

	public static void main(String [] args) {
		ArrayList<String> planets = new ArrayList<>();
		planets.add("Jupiter");
		planets.add("Mars");
		planets.add("Andromeda");
		planets.add("Venus");
		planets.add("Uranus");
		

		System.out.println(planets);
		


		// working with the get() 
		// get is used to retrieve an item from a list using index
		
		planets.get(0);
		planets.get(1);
		planets.get(2);
		planets.get(3);


		// getting the size of the array
		System.out.println("This size of array planets is : " + planets.size());

	}
}

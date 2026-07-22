import java.util.ArrayList;

public class Herd implements Movable{
	private ArrayList<Organism> organismsArray;

	// constructor
	public Herd() {
		this.organismsArray = new ArrayList<>();
	}

	public void move(int x, int y) {
		for (Organism item: this.organismsArray){
			item.move(x, y);
		}
	}

	public void addToHerd(Movable movable) {
		this.organismsArray.add((Organism) movable);
	}

	public String toString() {
		String message = "";
		for (Organism item: this.organismsArray) {
			message += item.toString() + "\n";
		}
		return message;
	}
}


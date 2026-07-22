public class Organism implements Movable{
	private int x;
	private int y;
	
	// constructor
	public Organism(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int x,  int y) {
		this.x  += x;
		this.y += y;
	}

	public String toString() {


		return "x: " +  this.x + "; "  + "y: " + this.y;
	}

}


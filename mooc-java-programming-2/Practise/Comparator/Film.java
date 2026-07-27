public class Film {

	private String filmName;
	private int publishYear;


	// constructor
	public Film(String name, int year) {
		this.filmName = name;
		this.publishYear = year;
	}

	public String getName() {
		return this.filmName;
	}
	
	public int getReleaseYear() {
		return this.publishYear;
	}
	public String toString() {
		return this.filmName + "(" + this.publishYear +  ")";
	}



}

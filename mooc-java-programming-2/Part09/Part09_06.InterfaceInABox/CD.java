public class CD implements Packable {

    private String artist;
    private String name;
    private int  pubYear;
    private double weight;
    // constructor
    public CD(String artist, String artistName, int year) {
        this.artist = artist;
        this.name = artistName;
        this.pubYear = year;
        this.weight = 0.1;
    }


    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
}


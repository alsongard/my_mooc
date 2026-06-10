
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) { // checks if compared points to the same object reference
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert to Song : typecasting
        Song comparedItem = (Song) compared;

        if (this.artist.equals(comparedItem.artist) && this.name.equals(comparedItem.name) && this.durationInSeconds == comparedItem.durationInSeconds) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}


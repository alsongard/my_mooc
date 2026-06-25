public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String birdName, String latinName) {
        this.name = birdName;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public void addObservation(){
        this.observationCount++;
    }

    public String getBirdName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations.";
    }
}


public class Cube {
    // class variable
    private int edgeLength;

    // constructor
    public Cube(int length) {
        this.edgeLength  = length;
    }  

    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + "and the volume is" + this.volume();
    }
}


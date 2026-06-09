public class Fitbyte {
    // class variables
    private int age;
    private int restingHeartRate;
    // private double maxHeartRate;

    
    //constructor
    public Fitbyte(int userAge, int userRestingHeartRate) {
        this.age = userAge;
        this.restingHeartRate = userRestingHeartRate;
    }

    public double targetHeartRate(double targetRate) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return ((maxHeartRate -  this.restingHeartRate ) * targetRate) + this.restingHeartRate;
    }
}


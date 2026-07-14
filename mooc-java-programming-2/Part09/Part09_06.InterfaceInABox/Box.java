import java.util.ArrayList;

public class Box implements Packable{
    private double boxWeight; 
    private double balance;

    private ArrayList<Packable> myPackableList;

    // constructor
    public Box(double weight) {
        this.boxWeight = weight;
        this.myPackableList = new ArrayList<>();
    }


    public void add(Packable item) {
        double sum = 0;
        if (this.myPackableList.size() > 0) { // 1, 2, 3..
            for (Packable listItem: this.myPackableList) {
                sum += listItem.weight();
            }

            if (sum + item.weight() < this.boxWeight) {
                // add item
                this.myPackableList.add(item);
            }

        } else {
            if (item.weight() < this.boxWeight) {
                this.myPackableList.add(item);
            }
        }
    }

    // packable method
    public double weight() {
        double sum = 0;
        for (Packable listItem: this.myPackableList) {
                    sum += listItem.weight();
        }
        return sum;
    }
    public double getTotalWeigth() {
        double sum = 0;
        for (Packable listItem: this.myPackableList) {
                    sum += listItem.weight();
        }
        return sum;
    }
    public String toString() {
        double totaWeight  = getTotalWeigth();
        return "Box: " + this.myPackableList.size() + " items, " + "total weight " + totaWeight + " kg";
    }
}


import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changesInProductInventory;

    public ChangeHistory() {
        this.changesInProductInventory = new ArrayList<>();
    }

    public void add(double status) {
        this.changesInProductInventory.add(status);
    }

    public void clear() {
        this.changesInProductInventory.clear();
    }

    public double maxValue() {
        double maxValue = this.changesInProductInventory.get(0);
        for(double valueInArray: this.changesInProductInventory) {
            if (valueInArray > maxValue) {
                maxValue = valueInArray;
            }
        }
        return maxValue;
    }
    public double minValue() {
        double minValue = this.changesInProductInventory.get(0);
        for(double valueInArray: this.changesInProductInventory) {
            if (minValue > valueInArray) {
                minValue = valueInArray;
            }
        }
        return minValue;
    }

    public double average() {
        double sum = 0.0;

        for (double val: this.changesInProductInventory) {
            sum += val;
        }

        return sum / this.changesInProductInventory.size();
    }
    public String toString() {
        return this.changesInProductInventory.toString();
    }
}


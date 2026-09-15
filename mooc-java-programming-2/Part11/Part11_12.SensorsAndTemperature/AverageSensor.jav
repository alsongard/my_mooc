package application;
import java.util.ArrayList;
import java.util.List;;
public class AverageSensor  implements  Sensor{
    // class variables
    private ArrayList<Sensor> mySensorsArray;
    private List<Integer> randomVals;
    // constructor
    public AverageSensor() {
        this.mySensorsArray = new ArrayList<>();
        this.randomVals = new ArrayList<>();
    }

    //  When setOff is called, at least one of the sensors must be set off. It's also acceptable to set off all the sensors.
    public void setOff() {
        for (Sensor item: this.mySensorsArray) {
            if (item.isOn()) {
                item.setOff(); 
            }   
        }
    }


    //  setOn is called, all the sensors must be set on.
    public void setOn() {
        for (Sensor item: this.mySensorsArray) {
            item.setOn();
        }
    }

    public boolean isOn() {
        for (Sensor item: this.mySensorsArray) {
            if (item.isOn()) {
                return true;
            } 
        }
        return false;
    }

    public int read() {
        if (this.mySensorsArray.size() == 0) {
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor item: this.mySensorsArray) {
            if (item.isOn()) { // get sum for moving to average
                int someValue =  item.read();
                this.randomVals.add(someValue);
                sum += someValue;
            }
        }
        // get average
        int average = (int) sum / this.mySensorsArray.size();
        return average;
    }
    public void addSensor(Sensor toAdd) {
        this.mySensorsArray.add(toAdd);
    } 

    public List<Integer> readings() {
        return this.randomVals;
    }
}


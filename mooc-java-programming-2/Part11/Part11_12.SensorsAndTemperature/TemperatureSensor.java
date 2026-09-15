package application;

import java.util.Random;

public class TemperatureSensor  implements  Sensor{
    // class isntances
    private boolean sensorStatus; 
    private Random random;

    
    // constructor
    public TemperatureSensor() {
        this.sensorStatus = false;
        this.random = new Random();
    }

    public void setOff() {
        this.sensorStatus = false;
    }
    public void setOn() {
        this.sensorStatus = true;
    }
    public boolean  isOn() {
        return this.sensorStatus;
    }

    public int  read() {
        if (!this.sensorStatus) {
            throw new IllegalStateException();
        }
        return this.random.nextInt(61) - 30;
    }
}


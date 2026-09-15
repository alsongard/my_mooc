package application;

public class StandardSensor implements  Sensor{
    private int num;
    // constructor
    public StandardSensor(int givenNum) {
        this.num = givenNum;
    }
    public boolean isOn() {
        return true;
    }

    public void setOn() {

    }

    public void  setOff() {

    }

    public int read() {
        return this.num;
    }
}


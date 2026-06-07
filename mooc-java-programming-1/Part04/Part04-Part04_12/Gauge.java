/*
    Problem Statement: 
     - Create class Gauge
     - With a constructor that does not take any parameter
     - Initialize value to be zero
     - Create method increase returns void and increases the instance value while less than 5
     - Create method decrease returns void and decreases the value up to 0 
     - Create method value that returns an object value
     - Create method full that returns a boolean if value == 5 : return true otherwise false
 */

public class Gauge {

    private int value; 
    // constructor
    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if(this.value > 0) {
            this.value--;
        }
    }
     
    public int value() {
        return this.value;
    }

    public boolean full() {
        if (this.value == 5) {
            return true;
        } else {
            return false;
        }
    }





}


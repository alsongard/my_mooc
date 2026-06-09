public class Timer {
    private int hundredth;
    private int seconds;

    public Timer() {

    }


    public void advance() {
        this.hundredth += 1;
        if (this.hundredth >= 100) {
            this.seconds += 1;
            this.hundredth = 0;
        }

        if (this.seconds >= 60) {
            this.seconds = 0;
        }
    }
    public String toString() {
        

        if (this.seconds < 10) {
            String mySeconds = "0" + this.seconds;
            if (this.hundredth < 10) {
                String myHundredth  =  "0" + this.hundredth;
                return mySeconds + ":" + myHundredth; 
            }
            return mySeconds + ":" +  this.hundredth;
        } else {
            if (this.hundredth < 10) {
                String myHundredth  =  "0" + this.hundredth;
                return this.seconds + ":" + myHundredth; 
            }
            return this.seconds + ":" + this.hundredth;
        }


    }
}


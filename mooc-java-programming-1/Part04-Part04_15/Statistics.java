import java.util.ArrayList;
public class Statistics {
    private int count;
    private int sum = 0;

    private  final ArrayList<Integer> numberArray = new ArrayList<>();
    // constructor
    public Statistics() {
        this.count = 0;
    }
    public void addNumber(int number) {
        this.numberArray.add(number);
        this.count++;
    }

    public int sum() {
         
        for(int num: numberArray) {
            this.sum += num;
        }
        return this.sum;
    }

    public double average() {

        if (this.count == 0) {
            return 0.0;
        }
        return (double) this.sum  / this.count;
    }
    public int getCount() {
        return this.count;
    }


   
}









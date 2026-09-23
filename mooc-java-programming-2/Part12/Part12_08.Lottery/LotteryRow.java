
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random myRandom;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.myRandom =  new Random();
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        // Implement the random number generation here
        // the method containsNumber is probably useful
        if ( this.numbers.size() > 0) {
            this.numbers.clear();
        }
        int count = 0;
        while(true) {
            if (this.numbers.size() == 7) {
                break;
            }
            int randomNum = myRandom.nextInt(40) + 1;
            if (this.numbers.contains(randomNum)) {
                continue;
            }
            this.numbers.add(randomNum);
            
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}



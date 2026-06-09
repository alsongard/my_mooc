public class Counter {
    private int counter; 

    public Counter(int userValue) {
        this.counter = userValue;
    }
    public Counter() {
        this.counter = 0;
    }

    public void increase() {
        this.counter++;
    }
    public void decrease() {
        this.counter--;
    }

    public int value() {
        return this.counter;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.counter += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.counter -= decreaseBy;
    }

}

/* 
Implement a class called Counter. The class contains a number whose value can be incremented and decremented. The class must have the following constructors:
    public Counter(int startValue) sets the start value of the counter to startValue.
    public Counter() sets the start value of the counter to 0.
And the following methods:
    public int value() returns the current value of the counter
    public void increase() increases the value by 1
    public void decrease() decreases the value by 1


*/

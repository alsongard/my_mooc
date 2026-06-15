import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stack.size() == 0) {
            return true;
        } else  {
            return false;
        }
    }

    public void add(String value) {
        this.stack.add(value);
    }
    

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String removedItem = this.stack.remove(this.stack.size() - 1);
        return removedItem;
    }
    /*
    public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
    public void add(String value) - Adds the value given as a parameter to the top of the stack.
    public ArrayList<String> values() - returns the values ​​contained in the stack as a list.
    
    Add to the Stack class a public String take() method, which returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    */
}


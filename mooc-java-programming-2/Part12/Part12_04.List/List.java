public class List <Type>{
    private Type[] values;
    private int emptyIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.emptyIndex = 0;
    }

    public void add(Type val) {
        if (this.emptyIndex == 10) {
            grow();
        }
        this.values[emptyIndex] = val;
        this.emptyIndex++;
    }

    public void remove(Type val) {
        // check if the value exist
        int foundIndex = findValue(val);
        if (foundIndex == -1) {
            return;
        }
        this.values[foundIndex] = null;
        moveIndex(foundIndex);
        // for(int i = 0; i <=this.emptyIndex; i++) {
        //     if (val.equals(this.values[i])) {
        //         this.values[i] = null;
        //     }
        // }
    }
    public boolean contains(Type val) {
        // check if the value exist
        int foundIndex = findValue(val);
        if (foundIndex == -1) {
            return false;
        }
        
        return true;
    }

    public int indexOfValue(Type val) {
        int foundIndex = findValue(val);
        if (foundIndex == -1) {
            return -1;
        }
        return foundIndex;
    }

    private void grow() { // method will be used for growing the array
        // create new  array by using emptyIndex
        // create a new length
        int newLength = this.emptyIndex + (this.emptyIndex/2);
        // create new array
        Type[] newValues = (Type[]) new Object[newLength];
        for (int i = 0;  i < this.emptyIndex; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
        this.emptyIndex++;
    }

    public void moveIndex(int givenIndex) {
        // move all values from the foundIndex of it's left value
        for (int i = givenIndex; i < this.emptyIndex; i++) {
            this.values[i] = this.values[i+1];
        }
        this.emptyIndex--;

    }
    public int findValue(Type val) {
        for(int i = 0; i <=this.emptyIndex; i++) {
            if (val.equals(this.values[i])) {
                return i;
            }
        }
        return -1;
    }

    public Type value(int givenIndex) {
        if (givenIndex < 0 || givenIndex >= this.emptyIndex) {
            throw new IndexOutOfBoundsException("Index " + givenIndex + " is out of bound");
        }
        return this.values[givenIndex];
    }
}


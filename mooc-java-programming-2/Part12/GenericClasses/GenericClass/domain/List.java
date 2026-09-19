package GenericClass.domain;

public class List<Type> {
    // set Array for K values
    private Type[] value;
    private int emptyIndex ;
    // constructor
    public List() {
        this.value = (Type[]) new Object[10];
        this.emptyIndex = 0;
    }


    public  void add(Type var) {

        // to enable unlimited size, we can use grow method
        if (this.emptyIndex == this.value.length) {
            grow();
        }
        this.value[emptyIndex] = var;
        this.emptyIndex++; // increment emptyIndex
    }

    // grow method used to increase the size of the array
    // this grow method uses the formula: newSize = oldSize + oldSize / 2;
    // copies all the data in the old array to a new array
    // and then reassigns the new Array to the old array
    public void grow() {
        // create new Array
        int newLength = this.value.length + this.value.length / 2;
        Type[] newArray = (Type[]) new Object[newLength];
        for (int i = 0; i < this.value.length; i++) { // copy all values from previousArray
            newArray[i] = this.value[i];
        }
        this.value = newArray;
    }

    // checks if this.values has the givenValue
    public boolean contains(Type givenValue) {
        if (givenValue instanceof String) { // use equals
            for (int i = 0; i < emptyIndex; i++) {
                if (this.value[i].equals(givenValue)) {
                    return true;
                }
            }
        } else if (givenValue instanceof Integer) {
            for (int i = 0; i < emptyIndex; i++) {
                if (this.value[i] == givenValue) {
                    return true;
                }
            }
        }
        return false;
    }

    // remove a value from an array
    public  void  remove(Type givenValue) {
        int returnIndex = indexOfValue(givenValue);
        if (returnIndex  < 0) {
            return;
        }
        moveToTheLeft(returnIndex);
        // a given index is found

        // for (int i = 0; i < emptyIndex; i++) {
        //     if (this.value[i].equals(givenValue)) {
        //         this.value[i] = null; // while using null  seems easy approach, this results in an error for the contains method, therefore we have to move every value in the rigth of the foundIndex to the left
        //         this.emptyIndex--;
        //         return;
        //     }
        // }

    }

    public int indexOfValue(Type givenValue) {
        for (int i = 0; i < emptyIndex; i++) {
            if (this.value[i].equals(givenValue)) {
                return i; // return index;
            }
        }
        return -1; // if value not found
    }

    public void moveToTheLeft(int givenIndex) {
        this.value[givenIndex] = null; // reassign the value at givenIndex to be null
        for (int i = givenIndex; i < this.emptyIndex - 1; i++) { //
            this.value[i] = this.value[i + 1]; // reassing it's value to the next value at index :  i + 1
        } // moves all left values of the givenIndex
        this.emptyIndex--;
    }

    public Type value(int index)  {
        if (index < 0 || index >= this.emptyIndex) {
            throw new ArrayIndexOutOfBoundsException("Index "  + index + " outside of [0"+ this.emptyIndex +  "]");
        }
        return this.value[index];
    }

    public int size() {
        return this.emptyIndex;
    }

}

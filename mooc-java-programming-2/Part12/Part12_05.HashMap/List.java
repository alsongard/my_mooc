// When using Array data structure : Integer[] myArray= new Integer[10]; 
// to access the length we use, length property

public class List <Type>{
    // define class variables
    private int  emptyIndex; 
    private Type[] myList;

    public List() {
        this.myList = (Type[]) new Object[10];
        this.emptyIndex = 0;
    }


    public void add(Type val)  {
        // this.size() calls the method for the Class 
        if (emptyIndex == this.myList.length) { // 1==10; false 10 == 10 : true
            grow();
        }
        this.myList[emptyIndex] = val;
        this.emptyIndex++;
    }

    public boolean contains(Type val) {
        int foundValIndex = indexOfValue(val);
        if (foundValIndex < 0) {
            return false;
        }
        return true;
    }

    public void remove(Type val) {
        for (int i = 0; i < this.emptyIndex; i++) {
            if (this.myList[i].equals(val)) {
                this.myList[i] = null;
            }
        }
    } 

    public Type value(Type val) { // retrieve an item within the list
        int foundValIndex = indexOfValue(val);
        if (foundValIndex < 0) {
            throw new IndexOutOfBoundsException("Value " + val +" is out of bounds!");
        }
        return this.myList[foundValIndex];
    }

    public  int size() {
        return this.emptyIndex;
    }

    public void grow() {
        // to grow , create a new List
        int newLength = Math.abs(this.myList.length + (this.myList.length/2));
        Type[] newList =  (Type[]) new Object[newLength];

        // copy all values from currentList to newList
        for (int i = 0; i < this.emptyIndex; i++) {
            newList[i] = this.myList[i];
        }
        this.myList = newList;
    }

    public int indexOfValue(Type val) {
        for (int i = 0; i < this.emptyIndex; i++) {
            if (this.myList[i].equals(val)) {
                return i;
            }
        }
        return  -1;
    }
    
    public void moveLeftVals(int index) {
        for (int j = index; j < this.emptyIndex - 1; j++) {
            this.myList[j] = this.myList[j+1];
        }
        this.myList[this.emptyIndex] = null;
        this.emptyIndex--;
    }
    
    public Type getItemUsingIndex(int ind) {
        return this.myList[ind];
    }
}   


import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> someVar;

    // parameterless constructor
    public Pipe() {
        this.someVar = new ArrayList<>();
    }

    /*
        public void putIntoPipe(T value) puts an object with a type in accordance with the type parameter given to the the class into the pipe.
        
        public T takeFromPipe() takes out the value, which has been in the pipe the longest. In case there is nothing in the pipe, return null. 
        Calling the method returns the value, which has been in the pipe the longest, and removes it from the pipe.
        
        public boolean isInPipe() returns the value true if the pipe has values. In case the pipe is empty, it returns the value false.
    */

    public void putIntoPipe(T value) {
        this.someVar.add(value);
    }

    public T takeFromPipe() {
        if ( this.someVar.size() == 0) {
            return null;
        }
        T oldestValue = this.someVar.get(0);
        this.someVar.remove(0);
        return oldestValue;
    }

    public boolean isInPipe() {
        if (this.someVar.size() == 0) {
            return false;
        }
        return true;
    }

}


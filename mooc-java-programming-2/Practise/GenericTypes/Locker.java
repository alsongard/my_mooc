public class Locker<T> {
    // define class variables
    private  T someVariable;

    public void setValue(T element) {
        this.someVariable = element;
    }

    public T getValue() {
        return this.someVariable;
    }
}

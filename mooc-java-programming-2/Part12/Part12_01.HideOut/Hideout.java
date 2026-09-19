public class Hideout<T> {

    private T someVar;
    // parameterless constructor
    public Hideout() {}

    public void putIntoHideout(T toHide) {
        this.someVar = toHide;
    }

    public T takeFromHideout() {
        if (this.someVar == null) {
            return null;
        }
        T theReturnValue = this.someVar;
        this.someVar = null;
        return theReturnValue;
    }

    public boolean isInHideout() {
        if (this.someVar == null) {
            return false;
        }
        return  true;
    }
}


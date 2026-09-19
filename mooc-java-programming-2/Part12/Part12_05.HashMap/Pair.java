public class Pair <K,V> {
    // define class variables
    private K key;
    private V value;

    // constructor
    public  Pair(K someKey, V someVal) {
        this.key = someKey;
        this.value = someVal;
    }

    public V getValue() {
        return this.value;
    }

    public K getKey() {
        return this.key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


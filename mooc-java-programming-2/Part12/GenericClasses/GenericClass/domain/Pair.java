package GenericClass.domain;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V val) {
        this.key = key;
        this.value = val;
    }


    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V val) {
        this.value = val;
    }
}

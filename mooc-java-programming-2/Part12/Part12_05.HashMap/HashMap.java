/*
    Differences between ArrayList and Array Data Structures
    | Operation | Array | ArrayList | 
    | ---- | ---- | ---- |
    | Read (Retrieve an element using index) Element | arr[i] | arraylist.get(i)  |
    | Write Element |arr[i] = value | arraylist.set(i, x); // i:index, x:value |
    | Append | not possible | arraylist.add(i) |
    | length | arr.length | arraylist.size() |

*/
import java.util.ArrayList;

public class HashMap< K, V> {
    // define class variables
    private int  emptyIndex;
    private ArrayList<List<Pair<K,V>>> myList;

    // constructor
    public  HashMap() {
        this.emptyIndex = 0;
        this.myList = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            this.myList.add(null);
        }
        
    }

    public void add(K key, V val) {
        // get hashcode 
        // check hashcode exist
        // if not add new  list  & then add value
        // if exist add to the list on that hashValue

        int hashValue = Math.abs(key.hashCode() %  this.myList.size());

        if (this.myList.get(hashValue) == null) {
            this.myList.set(hashValue,  new List<>());
        }

        this.myList.get(hashValue).add(new Pair<>(key, val)); // get List item in ArrayList, since List is a custom class call add to add Pair<K,V>
        this.emptyIndex++;
    }

    // get a key value
    public V getValue(K key) {
        // getHashCode to search for the key
        int hashValue = Math.abs(key.hashCode() % this.myList.size());
        if (this.myList.get(hashValue) == null) {
            return null;

        }
        List<Pair<K,V>> innerList = this.myList.get(hashValue);
        // if (innerList)
        for (int i = 0; i < innerList.size(); i++) {
            if(innerList.getItemUsingIndex(i).getKey().equals(key)) {
                return innerList.getItemUsingIndex(i).getValue();
            } 
        }
        return null;
    }


    public V remove(K key) {
        int foundHashIndex = getListBasedOnKey(key);
        if (foundHashIndex < 0) {
            return null;
        }
        Pair<K,V> foundPair = getPairVal(foundHashIndex, key);
        this.myList.get(foundHashIndex).remove(foundPair);

        return foundPair.getValue();

    }


    // get hashIndex
    public int getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.myList.size());
        if (this.myList.get(hashValue) == null) {
            return -1;
        }
        return hashValue;
    }
    
    // get PairInInnerList
    public Pair<K,V> getPairVal(int index, K key) {
        List<Pair<K,V>> innerList = this.myList.get(index);
        for (int i = 0; i < innerList.size(); i++) {
            if (innerList.getItemUsingIndex(i).getKey().equals(key)) {
                return innerList.getItemUsingIndex(i);
            }
        }
        return null;
        
    }


    // get indexOfListInArrayList

    // get key in List
}


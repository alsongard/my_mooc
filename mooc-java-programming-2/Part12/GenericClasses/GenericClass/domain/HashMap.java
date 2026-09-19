package GenericClass.domain;
import GenericClass.domain.List;
import GenericClass.domain.Pair;

public class HashMap<K,V> {
     // declare class variables
    private List<Pair<K, V>>[] hashList;
    private int emptyIndex;

    public HashMap() {
        this.hashList = new List[32];
        this.emptyIndex = 0;
    }

    public V getVal(K key) {
        // get hashCode % 2
        int index = Math.abs(key.hashCode % this.hashList.size());
        List<Pair<K, V>> foundKeyVal = this.hashList[index];

        for (int i = 0; i < foundKeyVal.size(); i++) {
            if  (foundKeyVal.value(i).getKey().equals(key)) {
                return foundKeyVal.value(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % this.hashList.length);

        if (this.hashList[hashValue] == null) {
            this.hashList[hashValue] = new List<>();
        }

        List<Pair<K,V>> valuesAtIndex  = this.hashList[hashValue];
        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) { // means that the innerList has 1 or more  Pair<K,V>
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        if (index < 0) { // when index is -1 : valuesAtIndex is a new List for Pair<K,V>
            valuesAtIndex.add(new Pair<>(key, value)); // Add the pair key value
            this.emptyIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);  // if index >= 0 : means a key for such givenKey exist, only  change value
        }

//        List<Pair<K, V>> foundList = getListBasedOnKey(key); // Can either return a found List in hashList or a new List
//        int foundIndexOnFoundList = getInnerIndexOfKey(foundList, key); // searches for the above foundList: -1 no key in foundList match : int (index) value  that  key exist
//        if (foundIndexOnFoundList < 0) { //
//            this.emptyIndex++;
//            foundList.add(new Pair<>(key, value));
//        } else {
//            foundList.value(foundIndexOnFoundList).setValue(value);
//        }

        if (1.0 * this.emptyIndex / this.hashList.length > 0.75) {
            grow();
        }
    }

    public List<Pair<K,V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode % this.hashList.size());// get hashCode % this.hashlist.length
        if  (this.hashList.values(hashValue) == null) {
            // add new empty array
            this.hashList[hashValue] = new List<Pair<K,V>>();
        }

        return this.hashList[hashValue];
    }

    public int getInnerIndexOfKey(List<Pair<K, V>> myList, K key ) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }


    // method increases the hashMapList;
    public void grow() {
        // create new array
        List<Pair<K,V>>[] newHashList = new List[this.hashList.size() * 2];

        for (int i = 0;  i < this.hashList.size(); i++) { // used to loop in the InnerList on HashMapList,
            // innerList
           copy(newHashList , i);
        }
        this.hashList =  newHashList;
    }

    // this method iterates through the list in HashMapList [  [Pair<K,V>, Pair<k1,V1>], [Pair<K2,V2>, Pair<K2,V2>] ]
    // the list contain Pair<K,V> values which are needed to be copied to their respective indexes
    public void copy(List<Pair<K,V>>[] newArray, int givenIndex) {
        // generate new hashCode
        List<Pair<K,V>> foundListInGivenIndex = this.hashList[givenIndex];
        for (int j = 0; j < foundListInGivenIndex.size(); i++) {
            // get pair value for the item in index i
            Pair<K,V> keyPairValue = foundListInGivenIndex.value(j);
            // get new hashCode for adding to new Array
            int  newHashCode = Math.abs(keyPairValue.getKey().hashCode() % newArray.length );
             if(newArray[newHashCode] == null) {
                // create innerList on HashList
                newArray[newHashCode] =  new List<>(); // we are using hashCodes as keys for the innerList;
            }

             newArray[newHashCode].add(keyPairValue);
        }
    }

    public V remove(K key) {
        List<Pair<K,V>> myList = getListBasedOnKey(key);
         int valReturn = getInnerIndexOfKey(myList, key);
         if (valReturn == -1) {
             return null;
         }

         Pair<K,V> keyValPair = myList.value(valReturn);
         myList.remove(keyValPair);
         return keyValPair.getValue();
    }
}

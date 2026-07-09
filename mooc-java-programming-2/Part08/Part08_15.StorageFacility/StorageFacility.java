import java.util.HashMap;
import java.util.ArrayList;
public class StorageFacility {

    private HashMap<String, ArrayList<String>> myStorage;

    // Default constructor
    public StorageFacility() {
        this.myStorage = new HashMap<>();
    }


    public void add(String unit, String item) {
        if (this.myStorage.get(unit) == null) {
            this.myStorage.put(unit, new ArrayList<>());
        }

        this.myStorage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.myStorage.get(storageUnit) == null) {
            return new ArrayList<>();
        }

        return this.myStorage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        this.myStorage.get(storageUnit).remove(item);
        if (this.myStorage.get(storageUnit).size() == 0) {
            this.myStorage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits()  {
        ArrayList<String> myStorageUnit = new ArrayList<>();

        for (String keyVal: this.myStorage.keySet()) {
            if (this.myStorage.get(keyVal).size() > 0) {
                myStorageUnit.add(keyVal);
            }
        }

        return myStorageUnit;
    }
}


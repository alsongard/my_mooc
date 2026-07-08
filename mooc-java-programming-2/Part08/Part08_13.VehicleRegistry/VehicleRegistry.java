import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {

        if (this.registry.get(licensePlate) != null) {
            return this.registry.get(licensePlate);
        }
        return null;
    }


    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.get(licensePlate) != null) {
            this.registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate keyVal: this.registry.keySet()) {
            System.out.println(keyVal);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String ownerVal: this.registry.values()) {
            if (printedOwners.contains(ownerVal)){
                continue;
            }
            System.out.println(ownerVal);
            printedOwners.add(ownerVal);
        }
        
    }

}


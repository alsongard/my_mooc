public class Item {
    private String name;
    private int weight;


    public Item(String itemName, int itemWeight) {
        this.name = itemName;
        this.weight = itemWeight;
    }
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name +  "(" + this.weight + ") kg";
    }
     /*
        Method public String getName(), which returns the item's name

        Method public int getWeight(), which returns the item's weight

        Method public String toString(), which returns the string "name (weight kg)"

    */
}


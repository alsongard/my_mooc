import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;


    public Suitcase(int weight) {
        this.maximumWeight = weight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int total = 0;
        if (this.items.size() > 0) {
            for (Item sampleItem: this.items) {
                total += sampleItem.getWeight();
            }
        }
        if (total + item.getWeight() >= this.maximumWeight + 1) {
            return;
        }
        this.items.add(item);
    }
    

    public void printItems() {
        for (Item listItem: this.items) {
            System.out.println(listItem);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item listItem : this.items) {
            totalWeight+=listItem.getWeight();
        }

        return totalWeight;
    }
    

    public Item heaviestItem() { // returns the largest item on the suitcase based on weight;
        if (this.items.size() == 0) {
            return null;
        }
        int maxWeight = 0;
        Item largestItem = items.get(0);
        for (Item lisItem : this.items) {
            if (lisItem.getWeight() > maxWeight) {
                maxWeight = lisItem.getWeight();
                largestItem = lisItem;
            }
        }    
        return largestItem;
    }

    public int getMaxSuitcase() {
        return this.maximumWeight;
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }  
        int totalWeight  = 0;
        String msgPart1 = "";


        if (this.items.size() == 1) {
            msgPart1 = "item ";
        } else {
            msgPart1="items ";
        }
        for (Item sampleItem: this.items) {
            totalWeight += sampleItem.getWeight();
        }
            
        
        return  this.items.size() + " "  + msgPart1  + "(" + totalWeight + " kg)";
    }




    /*
        Create a Suitcase class. The suitcase has items and a maximum weight that determines the maximum total weight of the items.
        Add the following methods to the class:
            Constructor, to which the maximum weight is provided
            The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.
            The method public String toString(), which returns the string "x items (y kg)"
        
        The class Suitcase should ensure that the total weight of the items within it does not exceed the maximum weight limit. If that limit would be exceeded as a result of the item to be added, the method addItem should not add the new item to the suitcase.
    */
}


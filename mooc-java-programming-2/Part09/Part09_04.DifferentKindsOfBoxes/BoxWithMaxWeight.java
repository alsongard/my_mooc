import java.util.ArrayList;
public class BoxWithMaxWeight  extends Box {
    private int maxBoxCapacity;
    private ArrayList<Item> myCollectionBoxForItems;
    // constructor
    public BoxWithMaxWeight(int capacity) { // capacity defined maxWeight
        super();
        this.maxBoxCapacity = capacity;
        this.myCollectionBoxForItems = new ArrayList<>();
    }


    @Override
    public void add(Item item) {

        int sum = 0;
        for (Item inBox : this.myCollectionBoxForItems) {
            sum += inBox.getWeight();
        }

        if (sum + item.getWeight() <= this.maxBoxCapacity ) {
            this.myCollectionBoxForItems.add(item);
        }
        return;
    }

    
    

    @Override
    public boolean isInBox(Item item) {
        if (this.myCollectionBoxForItems.contains(item)) {
            return true;
        }
        return false;
    }
}


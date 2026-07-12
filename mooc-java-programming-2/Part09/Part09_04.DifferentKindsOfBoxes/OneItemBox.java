import java.util.ArrayList;
public class OneItemBox extends Box {
    // only holds 1 item 

    private ArrayList<Item> myBoxArray;

    // constructor
    public OneItemBox() {
        super();
        this.myBoxArray = new ArrayList<>();
    }
    public void add(Item item) {
        if (this.myBoxArray.size() == 0) {
            this.myBoxArray.add(item);
        }
        
        return;
    }
    public void printItems() {
        for (Item inBox: this.myBoxArray) {
            System.out.println(inBox);
        }
    }
    public boolean isInBox(Item item) {
        if (this.myBoxArray.contains(item)) {
            return true;
        }
        return false;
    }
}


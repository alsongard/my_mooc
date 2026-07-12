import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> myBoxList;
    
    public MisplacingBox() {
        super();
        this.myBoxList = new ArrayList<>();
    }

    public void add(Item item) {
        this.myBoxList.add(item);
    }
     
    public boolean isInBox(Item item) {
        return false;
    }
}


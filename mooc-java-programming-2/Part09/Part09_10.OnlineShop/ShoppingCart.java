import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> collectionList;

    // constructor
    public ShoppingCart() {
        this.collectionList = new HashMap<>();
    }
    public void add(String product, int price) {
        if (this.collectionList.get(product) == null) {
            Item newItem = new Item(product, 1, price);
            this.collectionList.put(product, newItem);
        } else {
            this.collectionList.get(product).increaseQuantity();
        }
    }

    public int price() {
        int sum = 0;
        for (String keyValue: this.collectionList.keySet()) {
            // get the price
            sum += this.collectionList.get(keyValue).price() ;
        }
        return sum;
    }

    public void print() {
        for (String keyValue: this.collectionList.keySet()) {
            System.out.println(this.collectionList.get(keyValue));;
        }
    }
}


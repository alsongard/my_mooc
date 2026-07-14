import java.util.HashMap;

public class Item {
    
    private String product;
    private int unitPrice;
    private int quantity;
    // constructor

    public Item(String product, int qty, int price) {
        this.product = product;
        this.unitPrice = price;
        this.quantity = qty;
    }

    public int price(){
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}


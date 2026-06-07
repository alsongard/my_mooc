public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product( String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct() {
        // Output format: Banana, price 1.1, 13 pcs
        System.out.println(this.name + ", " + "price " + price + ", " + quantity + "pcs");
    }
}


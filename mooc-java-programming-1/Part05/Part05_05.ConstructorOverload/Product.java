
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product (String productName) {
        this.name = productName;
        this.location  = "shelf";
        this.weight = 1;
    }


    // creates a product with the given name and the given location. Its weight is set to 1.
    public Product(String productName, String productLocation) {
        this.name = productName;
        this.location = productLocation;
        this.weight = 1;
    }

    //creates a product with the given name and the given weight. Its location is set to "shelf".
    public Product(String productName, int productWeight)  {
        this.name = productName;
        this.weight = productWeight;
        this.location = "shelf";
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}


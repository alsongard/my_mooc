public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory ;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(this.getBalance());
        
    }

    public String history() {
        // System.out.println("in history");
        return changeHistory.toString();
        // beer: balance = 2.0, space left 8.0

    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        this.changeHistory.add(super.getBalance());
        return super.getBalance();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistory);
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> quantities;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.quantities = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    // use default Constructor
    public void addProduct(String  product, int price, int stock) {
        this.quantities.put(product, price);
        this.stockBalance.put(product, stock);
    }


    public int price(String product) {
        if (this.quantities.get(product) == null) {
            return -99;
        }
        return this.quantities.get(product);
    }

    public int stock(String product) {
        if (this.quantities.get(product) == null) {
            return 0;
        }
        return this.stockBalance.get(product);
    }

    public boolean take(String product) {
        // reduces product stock if exist by 1 && cannot go below zero , then return false
        // product does not exist return false

        if (this.stockBalance.get(product) == null) {
            return false;
        } else {
            if (this.stockBalance.get(product) > 0) {
                // reduce it's stock
                int value = this.stockBalance.get(product);
                this.stockBalance.put(product, value -1);
                return true;
            } else {
                return false;
            }

        }
    }   

    public Set<String> products() {
        return this.quantities.keySet();
    }
}


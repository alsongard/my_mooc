import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Test your app here
        // Warehouse warehouse = new Warehouse();
        // warehouse.addProduct("milk", 3, 10);
        // warehouse.addProduct("coffee", 5, 7);

        // System.out.println("prices:");
        // System.out.println("milk: " + warehouse.price("milk"));
        // System.out.println("coffee: " + warehouse.price("coffee"));
        // System.out.println("sugar: " + warehouse.price("sugar"));
    
        // Warehouse w = new Warehouse(); 
        // w.addProduct("milk", 3, 10); 
        // w.addProduct("coffee", 5, 1); 
        // System.out.println(w.take("milk"));
        // System.out.println(w.take("milk"));


        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());
    
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}


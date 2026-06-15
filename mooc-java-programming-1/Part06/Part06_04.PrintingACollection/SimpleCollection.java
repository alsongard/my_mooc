
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        String  message = "The collection " + this.name  + " has " + this.elements.size() + " element:";
        if (this.elements.size() > 1) {
            message = "The collection " + this.name  + " has " + this.elements.size() + " elements:";

        }
        String allItems = "";

        for (String itemName : this.elements) {
            if (this.elements.size() > 1) {

                allItems = allItems + itemName + "\n";
                continue;
            }
            allItems = allItems + itemName;
        }

        return message  + "\n" + allItems;
    }


    
}


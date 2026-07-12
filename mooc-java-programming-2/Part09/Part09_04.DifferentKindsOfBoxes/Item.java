
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        Item myObject = (Item) obj;
        if (this.name.equals(myObject.name)) {
            return true;
        }
        return false;
    }

    public int  hashCode() {
        return this.name.length();
    }

    public String toString(){
        return this.name + this.weight;
    }
}


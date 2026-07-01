public class Container {
    private int containerLiquitAmount;

    // default constructor
    public Container() {
        this.containerLiquitAmount = 0;
    }

    public int contains() {
        return this.containerLiquitAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.containerLiquitAmount + amount >= 101) {
            this.containerLiquitAmount = 100;
        } else {
            this.containerLiquitAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.containerLiquitAmount < amount) {
            this.containerLiquitAmount = 0;
        } else {
            this.containerLiquitAmount -= amount;
        }
    }

    public String toString() {
        return this.containerLiquitAmount + "/100";
    }
}


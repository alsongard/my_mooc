public class Container {
    private int containerContent;
    // default method
    public Container() {
        this.containerContent = 0;
    }

    public int contains() {
        return this.containerContent;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (amount + this.containerContent >= 101) {
            this.containerContent = 100;
            return;
        }

        this.containerContent += amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.containerContent - amount < 0) {
            this.containerContent = 0;
            return;
        }
        this.containerContent -= amount;
    }



    public String toString() {
        return this.containerContent + "/100";
    }
    /*
        public int contains() which returns the amount of liquid in a container as an integer.
        public void add(int amount) which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.
        public void remove(int amount) which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
        public String toString() which returns the container as a string formatted "amount of liquid/100, for example "32/100".

    */
}


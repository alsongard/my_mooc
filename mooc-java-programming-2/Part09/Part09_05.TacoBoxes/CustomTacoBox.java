public class CustomTacoBox implements TacoBox {
    private int tacos;

    // constructor
    public CustomTacoBox(int number) {
        this.tacos = number;
    }

    public int  tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos--;
        }
    }
}


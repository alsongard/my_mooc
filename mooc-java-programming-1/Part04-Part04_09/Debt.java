public class Debt {
    private double balance;
    private double interestRate;

    // constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
    public void waitOneYear() {
        this.balance = this.interestRate  * this.balance;
        // System.out.println("this is increase Amount " + increaseAmount);
        // this.balance = increaseAmount + this.balance;
    }
}


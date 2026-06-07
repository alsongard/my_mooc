public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance =  initialBalance;
    }


    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {
            return;
        }
        this.balance -= 2.60;
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {
            return;
        }
        this.balance -= 4.60;
    }

    public void addMoney(double value) { 
        if (value < 0) { // if value is less than 0 stop
            return;
        }
        
        // value to be given should not lead to >150
        if (this.balance + value >= 151) {
            double extra = (this.balance + value) - 150;
            this.balance = (this.balance   + value) - extra;
            return;
        }
        this.balance += value;
    }

    public String toString() {
        return "The card has a balance of " +  this.balance  + " euros";
    }
}


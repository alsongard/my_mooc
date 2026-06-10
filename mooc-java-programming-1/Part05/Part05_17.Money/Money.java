
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    // 5.05 e

    public Money plus(Money addition) {
        // access object Properties through typeCasting
        Money additionMoney = (Money) addition;
        int newEuro = this.euros + additionMoney.euros;

        if (this.cents + additionMoney.cents > 100) { 
            int addToEuro = (this.cents + additionMoney.cents) / 100; // return the numerator 

            int newCents = (this.cents + additionMoney.cents) % 100; // return the remainder

            return new Money(addToEuro+newEuro, newCents);
        }

        Money newUpdatedMoney = new Money(this.euros + additionMoney.euros, this.cents + additionMoney.cents);

        return newUpdatedMoney;
    }

    public boolean lessThan(Money compared) {
        // compares the value of the money on the object being called to the compared: if less return true , otherwise false;

        Money comparedMoney = (Money) compared;

        // get difference 
        int euroDifference = this.euros - comparedMoney.euros; // if negative  1 - 1.50  // if positive 2.0 - 1.50
         if (euroDifference == 0) { // what if euros difference is 0 and 80 cents and 50 cents on compare
            if (this.cents - comparedMoney.cents > 0 ) {
                return false;
            }  else {
                return true;
            }
        } else if (euroDifference > 0) { // we can borrow from euros which means this is greater than compared (100 cents - comparedMoney.cents(smaller) )
            return false;
        } else {
            return true;
        }

    }

    public Money minus(Money decreaser) { 
        // subtracts the value of the given decreaser from the objects which the method minus is called
        // if difference is negative the new Money () object being returned is 0


        // access decreaser values through typeCasting
        Money decreaserItem = (Money) decreaser;
        
        // perform subtraction
        int eurosDifference = this.euros - decreaserItem.euros;
        if (eurosDifference < 0) {
            return new Money(0, 0);
        }
        if (this.cents < decreaserItem.cents &&  eurosDifference > 1)  {// borrow from the euros: 1 euro = 100 cents
            eurosDifference--;
            int centsDifference = (this.cents + 100 )- decreaserItem.cents;

            return new Money(eurosDifference, centsDifference);
        }
        // mens this.cents is larger

        int centsDifference = this.cents - decreaserItem.cents;

        return new Money(eurosDifference, centsDifference);
    }

}


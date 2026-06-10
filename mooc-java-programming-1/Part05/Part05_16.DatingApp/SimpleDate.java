
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int someDays) {
        if (this.day < 30) {
            this.day++ ;
        } else {
            this.day = (this.day + someDays) - 30;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }   



    public SimpleDate afterNumberOfDays(int givenDays) {
        if (this.day  + givenDays  <= 30) {
            SimpleDate clonedSimpleDate = new SimpleDate(this.day + givenDays, this.month, this.year);
            return clonedSimpleDate;
        } 


        // increase month and reset date for new month
        int newMonthDate = (this.day + givenDays) - 30;
        // before increasing month check if it's below 12

        if (this.month < 12){
            int newMonth = this.month++;
            SimpleDate clonedSimpleDate = new SimpleDate(newMonthDate, newMonth, this.year);
            return clonedSimpleDate;
        }

        // otherwise rest the month : means month is 12 going to newYear : value of Year changes to newYear
        int newMonth = 1;
        int newYear = this.year + 1;

      
        SimpleDate clonedSimpleDate = new SimpleDate(newMonthDate, newMonth, newYear);
        return clonedSimpleDate;

    }
}


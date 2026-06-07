
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt mortgage = new Debt(120000.0, 1.01);
        // System.out.println("this is balance");
        mortgage.printBalance();

        mortgage.waitOneYear();
        // mortgage.waitOneYear();
        mortgage.printBalance();
        int years = 0;

        while (years < 20) {
           mortgage.waitOneYear();
           years = years + 1;
        }

        mortgage.printBalance();
        // The balance should increase when waiting a year. Expected 3000.0 .When we did
        Debt v = new Debt(1500.0, 2.0);
        v.waitOneYear();
        // v.waitOneYear();
        v.printBalance();
        // Output was:
        // 1530.0
    }
}


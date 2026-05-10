
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int userGift = Integer.valueOf(scan.nextLine());

        double tax = 0.0;
        if (userGift < 5000) {
            System.out.println("No Tax!");
        } else if (userGift >= 5000 && userGift < 25000) {
            tax = 100 +((userGift - 5000) * 0.08);
            System.out.println("Tax: " + tax);

        } else if (userGift >= 25000 && userGift < 55000) {
            tax = 1700 +((userGift - 25000) * 0.1);
            System.out.println("Tax: " + tax);

        } else if (userGift >= 55000 && userGift < 200000) {
            tax = 4700 +((userGift - 55000) * 0.12);
            System.out.println("Tax: " + tax);
            
        } else if (userGift >= 200000 && userGift < 1000000) {
            tax = 22100 +((userGift - 200000) * 0.15);
            System.out.println("Tax: " + tax);

        } else if (userGift > 1000000) {
            tax = 142100 +((userGift - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
        
    }
}


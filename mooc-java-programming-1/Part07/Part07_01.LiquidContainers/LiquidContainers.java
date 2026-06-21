
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            // System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } 

            if (input.startsWith("add")) {
                int value = Integer.valueOf(input.split(" ")[1]);
                // add  always add to first containe and should not excee 100
                if (value < 0) {
                    continue;
                }
                
                if (value + first >= 101) {
                    if (first < 100) {
                        first = 100;
                    }
                    continue;
                }
                first += value;
            } else if (input.startsWith("remove")) {
                int value = Integer.valueOf(input.split(" ")[1]);
                if (second - value  < 0) {
                    second = 0;
                } else {
                    second -= value;
                }
            } else if (input.startsWith("move")) {
                int value = Integer.valueOf(input.split(" ")[1]);
                if (first < value) {
                    second = first;
                    first = 0;
                    continue;
                }
                
                if (value + second >= 101) {
                    second = 100;
                    continue;
                }
                second += value;
                first -= value;

            }

        }
    }

    // public void add(String someValue) {

    // }

    // public void move(String someValue) {

    // }

    // public void remove(String someValue) {
        
    // }
}


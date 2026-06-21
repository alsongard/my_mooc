
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("remove")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                second.remove(amount);
            } else if (input.startsWith("move")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                if (first.contains() < amount) {
                    int toAddtoSecond = first.contains();
                    first.remove(amount);
                    second.add(toAddtoSecond);
                    continue;
                }
                
                first.remove(amount);
                second.add(amount);
            } else if (input.startsWith("add")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                first.add(amount);
            }

        }

        // Container container = new Container();
        // System.out.println(container);

        // container.add(50);
        // System.out.println(container);
        // System.out.println(container.contains());

        // container.remove(60);
        // System.out.println(container);

        // container.add(200);
        // System.out.println(container);
    }

}


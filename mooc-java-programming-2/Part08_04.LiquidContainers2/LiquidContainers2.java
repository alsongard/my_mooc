
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Container container = new Container();
        // System.out.println(container);

        // container.add(50);
        // System.out.println(container);
        // System.out.println(container.contains());

        // container.remove(60);
        // System.out.println(container);

        // container.add(200);
        // System.out.println(container);
        Container firstContainer = new Container();
        Container secondContainer = new Container();


        while (true) {
            // System.out.print("> ");
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            String givenValue  = splitInput[1];

            if (command.equals("add")) {
                int userValue = Integer.valueOf(givenValue);
                firstContainer.add(userValue);
            }
            else if (command.equals("move")) {
                int userValue = Integer.valueOf(givenValue);
                // removes from first containe and then to second Container
                if (userValue > firstContainer.contains()) {
                    // System.out.println("Uservalue is greater " + userValue + " than firstContainer" + firstContainer);
                    if (secondContainer.contains() + firstContainer.contains() >= 101) {
                        secondContainer.add(100);
                        firstContainer.remove(userValue);
                    } else {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(userValue);
                    }
                } else {
                    // System.out.println("Uservalue is less  " + userValue + " than firstContainer" + firstContainer);

                    if (secondContainer.contains() + firstContainer.contains() >= 101) {
                        // System.out.println("executing on if");
                        secondContainer.add(100);
                        firstContainer.remove(userValue);;
                    } else {
                        // System.out.println("executing in else ");
                        secondContainer.add(userValue);
                        firstContainer.remove(userValue);
                    }
                }
            } else if (command.equals("remove")) {
                // remove from second contianer;
                int userValue = Integer.valueOf(givenValue);

                if (userValue > secondContainer.contains()) {
                    secondContainer.remove(userValue);
                } else {
                    secondContainer.remove(userValue);;
                }
            }

        }
     
    }

}


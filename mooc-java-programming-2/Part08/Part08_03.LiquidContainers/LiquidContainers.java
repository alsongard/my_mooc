
import java.util.Scanner;

 class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // funcitonal Programm
        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            String givenValue  = splitInput[1];
            if (command.equals("add")) {
                // add to first container only

                int userValue = Integer.valueOf(givenValue);
                if (userValue < 0) {
                    continue;
                } else if (firstContainer + userValue >= 101) {
                    firstContainer = 100;
                } else {
                    firstContainer += userValue;
                }
            } else if (command.equals("move")) {
                int userValue = Integer.valueOf(givenValue);
                if (userValue > firstContainer) {
                    // System.out.println("Uservalue is greater " + userValue + " than firstContainer" + firstContainer);
                    if (secondContainer + firstContainer >= 101) {
                        secondContainer = 100;
                        firstContainer = 0;
                    } else {
                        secondContainer+= firstContainer;
                        firstContainer = 0;
                    }
                } else {
                    // System.out.println("Uservalue is less  " + userValue + " than firstContainer" + firstContainer);

                    if (secondContainer + firstContainer >= 101) {
                        // System.out.println("executing on if");
                        secondContainer = 100;
                        firstContainer = 0;
                    } else {
                        // System.out.println("executing in else ");
                        secondContainer += userValue;
                        firstContainer -= userValue;
                    }
                }
            } else if (command.equals("remove")) {
                // remove from second contianer;
                int userValue = Integer.valueOf(givenValue);
                if (userValue > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= userValue;
                }
            }

        }
    }

}


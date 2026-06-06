/*
 * Problem Statement: Write a program that reads user input until an empty line is entered. 
 * For each non-empty line the program splits the string by spaces  and prints the last part of the string.
*/


import java.util.Scanner;

class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userText = scanner.nextLine();
            if (!userText.isEmpty()) {
                String[] textArray  = userText.split(" ");
                System.out.println(textArray[textArray.length - 1]);
            } else {
                break;
            }
        }

    }
}


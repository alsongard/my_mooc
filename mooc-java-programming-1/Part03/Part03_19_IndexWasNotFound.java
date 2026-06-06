

import java.util.Scanner;

class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        int i = 0;
        boolean search = false;
        while (i < array.length) { // when i reachers 01234...9 < 10 ; true but when it's 10 false
            if (array[i] == searching) {
                search = true;
                System.out.println(searching + " is at index " + i + ".");
            } else if (i == array.length - 1 && !search){
                System.out.println(searching +  " was not found in array.");
                // System.out.println("Try Again");
            }
            i++;
        }
    }

}



import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        String[] input  = {"Art of War" , "The Bible " , "Shingeki no Kyojin" , "Devil May Cry" , "Avengers" }; 
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i,input[i]));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        // get middle value 
        // check if searchValue is greater or smaller then split, recontinue this concept untill found value

        int begin = 0;
        int end = books.size() - 1;

        while (begin <= end) {
            int middleValue = (begin + end) /2; 
            if (books.get(middleValue).getId() == searchedId) {
                // System.out.println("We found the value: " + middleValue + "is " + searchedId);
                return middleValue;
            } else if (books.get(middleValue).getId() < searchedId) {
                // continue to the right
                // System.out.println("book middle id is smaller"  + books.get(middleValue).getId() + " than searchId "  + searchedId);
                // System.out.println("Therefore we move begin to the next value after middle");
                begin = middleValue + 1;

            } else if (searchedId < books.get(middleValue).getId()) {
                // continue to the left 
                // System.out.println("book middle id is larger"  + books.get(middleValue).getId() + " than searchId "  + searchedId);
                // System.out.println("Therefore we move end to the previous value before middle");
                end = middleValue - 1;
            }
        }
        return -1;
    }
}



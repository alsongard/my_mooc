import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> allBooks = new ArrayList<>();

        while (true) {
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            int pagesTotal = Integer.valueOf(scanner.nextLine());
            String yearOfPublication = scanner.nextLine();


            Book userBook = new Book(bookTitle, yearOfPublication, pagesTotal);

            allBooks.add(userBook);
        }

        System.out.println("What information will be printed?");
        String userInput = scanner.nextLine();

        if (userInput.equals("everything")) {
            for(Book bookItem: allBooks) {
                System.out.println(bookItem);
            }
        } else if (userInput.equals("name")) {
            for(Book bookItem: allBooks) {
                System.out.println(bookItem.getBookTitle());
            }
        } 
    }
}


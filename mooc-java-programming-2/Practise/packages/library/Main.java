package library;

import library.domain.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main in library");
        
        Book myBook = new Book("Art of War");

        System.out.println(myBook.getName());
    }
}


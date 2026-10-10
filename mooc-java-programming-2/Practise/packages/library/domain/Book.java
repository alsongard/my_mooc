package library.domain;

public class Book {
    private String name;

    // Default constructor
    public Book(String givenName) {
        this.name = givenName;
    }

    public String getName() {
        return this.name;
    }
}

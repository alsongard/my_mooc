public class Book {
    private String title;
    private String pulbicationYear;
    private int totalPages;

    // constructor
    public Book(String bookTitle, String pubyear, int numberOfPages) {
        this.title = bookTitle;
        this.totalPages = numberOfPages;
        this.pulbicationYear = pubyear;
    }

    public String getBookTitle() {
        return this.title;
    }

    public String getPublicationyear() {
        return this.pulbicationYear;
    }

    public int getTotalPages() {
        return this.totalPages;
    }
    
    public String toString() {
        return this.title + ", " + this.totalPages + " pages, " + this.pulbicationYear;
    }
}


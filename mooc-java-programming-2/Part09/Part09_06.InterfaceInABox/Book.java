public class Book implements Packable{
    private String author;
    private String name;
    private double bookWeight;
    // constructor
    public Book(String bookAuthor, String bookName,double bookWeight) {
        this.author = bookAuthor;
        this.name = bookName;
        this.bookWeight  = bookWeight;
    }


    public double weight() {
        return this.bookWeight;
    }

    public String toString() {
        return this.author + ": " + this.name;
    }
}

